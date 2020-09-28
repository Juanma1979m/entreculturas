/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaController;

import entidades.Periodicidad;
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
public class PeriodicidadJpaController implements Serializable {

    public PeriodicidadJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Periodicidad periodicidad) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(periodicidad);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPeriodicidad(periodicidad.getId()) != null) {
                throw new PreexistingEntityException("Periodicidad " + periodicidad + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Periodicidad periodicidad) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            periodicidad = em.merge(periodicidad);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = periodicidad.getId();
                if (findPeriodicidad(id) == null) {
                    throw new NonexistentEntityException("The periodicidad with id " + id + " no longer exists.");
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
            Periodicidad periodicidad;
            try {
                periodicidad = em.getReference(Periodicidad.class, id);
                periodicidad.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The periodicidad with id " + id + " no longer exists.", enfe);
            }
            em.remove(periodicidad);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Periodicidad> findPeriodicidadEntities() {
        return findPeriodicidadEntities(true, -1, -1);
    }

    public List<Periodicidad> findPeriodicidadEntities(int maxResults, int firstResult) {
        return findPeriodicidadEntities(false, maxResults, firstResult);
    }

    private List<Periodicidad> findPeriodicidadEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Periodicidad.class));
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

    public Periodicidad findPeriodicidad(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Periodicidad.class, id);
        } finally {
            em.close();
        }
    }

    public int getPeriodicidadCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Periodicidad> rt = cq.from(Periodicidad.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

