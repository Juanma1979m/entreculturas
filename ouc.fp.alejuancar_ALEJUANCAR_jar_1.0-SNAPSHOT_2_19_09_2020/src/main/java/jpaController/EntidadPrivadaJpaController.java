/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaController;

import entidades.EntidadPrivada;
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
public class EntidadPrivadaJpaController implements Serializable {

    public EntidadPrivadaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(EntidadPrivada entidadPrivada) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entidadPrivada);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEntidadPrivada(entidadPrivada.getIdPrivado()) != null) {
                throw new PreexistingEntityException("EntidadPrivada " + entidadPrivada + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(EntidadPrivada entidadPrivada) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entidadPrivada = em.merge(entidadPrivada);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = entidadPrivada.getIdPrivado();
                if (findEntidadPrivada(id) == null) {
                    throw new NonexistentEntityException("The entidadPrivada with id " + id + " no longer exists.");
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
            EntidadPrivada entidadPrivada;
            try {
                entidadPrivada = em.getReference(EntidadPrivada.class, id);
                entidadPrivada.getIdPrivado();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entidadPrivada with id " + id + " no longer exists.", enfe);
            }
            em.remove(entidadPrivada);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<EntidadPrivada> findEntidadPrivadaEntities() {
        return findEntidadPrivadaEntities(true, -1, -1);
    }

    public List<EntidadPrivada> findEntidadPrivadaEntities(int maxResults, int firstResult) {
        return findEntidadPrivadaEntities(false, maxResults, firstResult);
    }

    private List<EntidadPrivada> findEntidadPrivadaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(EntidadPrivada.class));
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

    public EntidadPrivada findEntidadPrivada(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(EntidadPrivada.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntidadPrivadaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<EntidadPrivada> rt = cq.from(EntidadPrivada.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

