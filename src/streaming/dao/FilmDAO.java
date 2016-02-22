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
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDAO {
    
    public void ajouter(Film f){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }
    
    public void modifier(Film f){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }
    
    public void supprimer(Film f){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Film f WHERE f.id="+f.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Film> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f FROM Film f").getResultList();
    }
    
    public Film rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Film.class, id);
    }
    
}
