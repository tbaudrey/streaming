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

/**
 *
 * @author admin
 */
public class LienDAO {
    
    public void ajouter(Lien l){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
    }
    
    public void modifier(Lien l){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(l);
        em.getTransaction().commit();
    }
    
    public void supprimer(Lien l){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Lien l WHERE l.id="+l.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Lien> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT l FROM Lien l").getResultList();
    }
    
    public Lien rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Lien.class, id);
    }
    
}
