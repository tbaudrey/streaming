/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
public class EpisodeDAO {
    
    public void ajouter(Episode e){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
    
    public void modifier(Episode e){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
    }
    
    public void supprimer(Episode e){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Episode e WHERE e.id="+e.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Episode> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT e FROM Episode e").getResultList();
    }
    
    public Episode rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Episode.class, id);
    }
    
}
