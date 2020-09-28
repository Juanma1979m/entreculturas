/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaController;

import entidades.SocioHasProyectos;
import entidades.SocioHasProyectosPK;
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
public class SocioHasProyectosJpaController implements Serializable {

    public SocioHasProyectosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SocioHasProyectos socioHasProyectos) throws PreexistingEntityException, Exception {
        if (socioHasProyectos.getSocioHasProyectosPK() == null) {
            socioHasProyectos.setSocioHasProyectosPK(new SocioHasProyectosPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(socioHasProyectos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSocioHasProyectos(socioHasProyectos.getSocioHasProyectosPK()) != null) {
                throw new PreexistingEntityException("SocioHasProyectos " + socioHasProyectos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SocioHasProyectos socioHasProyectos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            socioHasProyectos = em.merge(socioHasProyectos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                SocioHasProyectosPK id = socioHasProyectos.getSocioHasProyectosPK();
                if (findSocioHasProyectos(id) == null) {
                    throw new NonexistentEntityException("The socioHasProyectos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(SocioHasProyectosPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SocioHasProyectos socioHasProyectos;
            try {
                socioHasProyectos = em.getReference(SocioHasProyectos.class, id);
                socioHasProyectos.getSocioHasProyectosPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The socioHasProyectos with id " + id + " no longer exists.", enfe);
            }
            em.remove(socioHasProyectos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SocioHasProyectos> findSocioHasProyectosEntities() {
        return findSocioHasProyectosEntities(true, -1, -1);
    }

    public List<SocioHasProyectos> findSocioHasProyectosEntities(int maxResults, int firstResult) {
        return findSocioHasProyectosEntities(false, maxResults, firstResult);
    }

    private List<SocioHasProyectos> findSocioHasProyectosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SocioHasProyectos.class));
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

    public SocioHasProyectos findSocioHasProyectos(SocioHasProyectosPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SocioHasProyectos.class, id);
        } finally {
            em.close();
        }
    }

    public int getSocioHasProyectosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SocioHasProyectos> rt = cq.from(SocioHasProyectos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

