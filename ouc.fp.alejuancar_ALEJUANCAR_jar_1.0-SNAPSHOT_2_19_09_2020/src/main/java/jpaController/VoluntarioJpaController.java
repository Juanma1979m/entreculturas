/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaController;

import entidades.Voluntario;
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
public class VoluntarioJpaController implements Serializable {

    public VoluntarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Voluntario voluntario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(voluntario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVoluntario(voluntario.getIdVoluntario()) != null) {
                throw new PreexistingEntityException("Voluntario " + voluntario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Voluntario voluntario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            voluntario = em.merge(voluntario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = voluntario.getIdVoluntario();
                if (findVoluntario(id) == null) {
                    throw new NonexistentEntityException("The voluntario with id " + id + " no longer exists.");
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
            Voluntario voluntario;
            try {
                voluntario = em.getReference(Voluntario.class, id);
                voluntario.getIdVoluntario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The voluntario with id " + id + " no longer exists.", enfe);
            }
            em.remove(voluntario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Voluntario> findVoluntarioEntities() {
        return findVoluntarioEntities(true, -1, -1);
    }

    public List<Voluntario> findVoluntarioEntities(int maxResults, int firstResult) {
        return findVoluntarioEntities(false, maxResults, firstResult);
    }

    private List<Voluntario> findVoluntarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Voluntario.class));
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

    public Voluntario findVoluntario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Voluntario.class, id);
        } finally {
            em.close();
        }
    }

    public int getVoluntarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Voluntario> rt = cq.from(Voluntario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

