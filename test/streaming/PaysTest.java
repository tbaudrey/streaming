/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class PaysTest {
    
    @Test
    public void TestTab(){
        
        int[] monTab = new int[15];
        
        for(int i=0; i<monTab.length;i++){
            monTab[i]=2*i;
            if(i<monTab.length -1 ){
                System.out.print(monTab[i] + ", ");
            }
            else
                System.out.print(monTab[i] + " fin");
        }
//        System.out.println(monTab);     
    }
    
    @Test
    public void TestTab2(){
        
        int[] monTab = new int[15];
        
        for(int i=0; i<monTab.length;i++){
            monTab[i]=2*i;
            if(i<monTab.length -1 ){
                System.out.print(monTab[i] + ", ");
            }
            else
                System.out.print(monTab[i] + " fin");
        }
//        System.out.println(monTab);     
    }
    
//    @BeforeClass
    public static void avantClasse(){
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        
        //Vide toutes les tables
        em.createQuery("DELETE FROM Genre g").executeUpdate();
        em.createQuery("DELETE FROM Realisateur r").executeUpdate();
        em.createQuery("DELETE FROM Pays p").executeUpdate();
        
        // Ajoute un nouveau genre
       Genre g = new Genre();
       g.SetNom("Animé");
       g.setId(1L);
       em.persist(g);
       
       g = new Genre();
       g.SetNom("Action");
       g.setId(2L);
       em.persist(g);
       
       g = new Genre();
       g.SetNom("SF");
       g.setId(3L);
       em.persist(g);
      
       Pays p = new Pays();
       p.setNom("France");
       p.setId(1L);
       em.persist(p);
       
       p = new Pays();
       p.setNom("USA");
       p.setId(2L);
       em.persist(p);

       p = new Pays();
       p.setNom("Espagne");
       p.setId(3L);
       em.persist(p);

       Realisateur r = new Realisateur();
       r.SetNom("Tarantino");
       r.SetPrenom("Quentin");
       r.setId(1L);
       em.persist(r);
       
       r = new Realisateur();
       r.SetNom("Lucas");
       r.SetPrenom("Georges");
       r.setId(2L);
       em.persist(r);
       
       r = new Realisateur();
       r.SetNom("Almodovar");
       r.SetPrenom("Pedro");
       r.setId(3L);
       em.persist(r);

       em.getTransaction().commit();
        
    }
 
//    @Test
    public void verifNbTotalPaysEgal3(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Query query = em.createQuery("SELECT p FROM Pays p");
        List<Pays> liste=query.getResultList();
        int n=liste.size();
        
        Assert.assertEquals(3,n);
        
        if(liste.size()==3){
            System.out.println("OK");
        }
    }
    
    
//    @Test
    public void verifTarantinoId1(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();

        Realisateur r =(Realisateur) em.createQuery("SELECT r from Realisateur r WHERE r.nom='Tarantino' ").getSingleResult();
        
        Assert.assertEquals(r.getId(),(Long)1L);
        
    }
    
    
}
