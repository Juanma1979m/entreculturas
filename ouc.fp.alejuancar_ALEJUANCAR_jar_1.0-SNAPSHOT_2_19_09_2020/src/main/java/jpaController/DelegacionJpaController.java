/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaController;

import entidades.Delegacion;
import entidades.DelegacionPK;
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
public class DelegacionJpaController implements Serializable {

    public DelegacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Delegacion delegacion) throws PreexistingEntityException, Exception {
        if (delegacion.getDelegacionPK() == null) {
            delegacion.setDelegacionPK(new DelegacionPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(delegacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDelegacion(delegacion.getDelegacionPK()) != null) {
                throw new PreexistingEntityException("Delegacion " + delegacion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Delegacion delegacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            delegacion = em.merge(delegacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                DelegacionPK id = delegacion.getDelegacionPK();
                if (findDelegacion(id) == null) {
                    throw new NonexistentEntityException("The delegacion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(DelegacionPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Delegacion delegacion;
            try {
                delegacion = em.getReference(Delegacion.class, id);
                delegacion.getDelegacionPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The delegacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(delegacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Delegacion> findDelegacionEntities() {
        return findDelegacionEntities(true, -1, -1);
    }

    public List<Delegacion> findDelegacionEntities(int maxResults, int firstResult) {
        return findDelegacionEntities(false, maxResults, firstResult);
    }

    private List<Delegacion> findDelegacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Delegacion.class));
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

    public Delegacion findDelegacion(DelegacionPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Delegacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getDelegacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Delegacion> rt = cq.from(Delegacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

