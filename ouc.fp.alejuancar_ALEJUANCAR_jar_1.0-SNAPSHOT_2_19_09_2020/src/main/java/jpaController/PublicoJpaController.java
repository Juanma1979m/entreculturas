/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaController;

import entidades.Publico;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import jpaController.exceptions.NonexistentEntityException;
import jpaController.exceptions.PreexistingEntityException;

/**
 *
 * @author juanm
 */
public class PublicoJpaController implements Serializable {

    public PublicoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Publico publico) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(publico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPublico(publico.getIdPublico()) != null) {
                throw new PreexistingEntityException("Publico " + publico + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Publico publico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            publico = em.merge(publico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = publico.getIdPublico();
                if (findPublico(id) == null) {
                    throw new NonexistentEntityException("The publico with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Publico publico;
            try {
                publico = em.getReference(Publico.class, id);
                publico.getIdPublico();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The publico with id " + id + " no longer exists.", enfe);
            }
            em.remove(publico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Publico> findPublicoEntities() {
        return findPublicoEntities(true, -1, -1);
    }

    public List<Publico> findPublicoEntities(int maxResults, int firstResult) {
        return findPublicoEntities(false, maxResults, firstResult);
    }

    private List<Publico> findPublicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Publico.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Publico findPublico(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Publico.class, id);
        } finally {
            em.close();
        }
    }

    public int getPublicoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Publico> rt = cq.from(Publico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

