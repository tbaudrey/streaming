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
import streaming.entity.Genre;
import streaming.entity.Lien;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class RealisateurDAO {
    
    public void ajouter(Realisateur r){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();
    }
    
    public void modifier(Realisateur r){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(r);
        em.getTransaction().commit();
    }
    
    public void supprimer(Realisateur r){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Realisateur r WHERE r.id="+r.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Realisateur> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT r FROM Realisateur r").getResultList();
    }
    
    public Realisateur rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Realisateur.class, id);
    }
    
}
