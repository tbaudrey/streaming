/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
public class DBServiceStreaming {
    
    public void supprimerTout(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        
        em.createQuery("DELETE FROM Lien").executeUpdate();
        em.createQuery("DELETE FROM Episode").executeUpdate();
        em.createQuery("DELETE FROM Saison").executeUpdate();
        em.createQuery("DELETE FROM Serie").executeUpdate();
        em.createQuery("DELETE FROM Film").executeUpdate();
        em.createQuery("DELETE FROM Realisateur").executeUpdate();
        em.createQuery("DELETE FROM Pays").executeUpdate();
        em.createQuery("DELETE FROM Genre").executeUpdate();
        
        em.getTransaction().commit();
    }
    
}
