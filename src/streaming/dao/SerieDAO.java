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
import streaming.entity.Saison;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {
    
    public void ajouter(Serie s){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }
    
    public void modifier(Serie s){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(s);
        em.getTransaction().commit();
    }
    
    public void supprimer(Serie s){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Serie s WHERE s.id="+s.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Serie> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT s FROM Serie s").getResultList();
    }
    
    public Serie rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Serie.class, id);
    }
    
}
