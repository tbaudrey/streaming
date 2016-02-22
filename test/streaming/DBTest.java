/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import org.junit.Before;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;
import streaming.service.DBServiceStreaming;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.PaysService;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
public class DBTest {

    private GenreService genreService = new GenreService();
    private PaysService paysService = new PaysService();
    private RealisateurService realisateurService = new RealisateurService();
    private FilmService filmService = new FilmService();

//    @Before
    public void testDB() {
        new DBServiceStreaming().supprimerTout();

        //Genre
        {
            Genre g = new Genre("Action");
            g.setId(1L);
            genreService.ajouter(g);

        }
        {
            Genre g = new Genre("Fantastique");
            g.setId(2L);
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre("Policier");
            g.setId(3L);
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre("Romance");
            g.setId(4L);
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre("Animation");
            g.setId(5L);
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre("Comedie");
            g.setId(6L);
            genreService.ajouter(g);
        }

        //Pays
        {
            Pays p = new Pays("France");
            p.setId(1L);
            paysService.ajouter(p);
        }
        {
            Pays p = new Pays("USA");
            p.setId(2L);
            paysService.ajouter(p);
        }
        {
            Pays p = new Pays("UK");
            p.setId(3L);
            paysService.ajouter(p);
        }
        {
            Pays p = new Pays("Espagne");
            p.setId(4L);
            paysService.ajouter(p);
        }
        {
            Pays p = new Pays("NZ");
            p.setId(5L);
            paysService.ajouter(p);
        }

        //Realisateur
        {
            Realisateur r = new Realisateur("Cohen", "Joel");
            r.setId(1L);
            realisateurService.ajouter(r);
        }
        {
            Realisateur r = new Realisateur("Cohen", "Ethan");
            r.setId(2L);
            realisateurService.ajouter(r);
        }
        {
            Realisateur r = new Realisateur("Jackson", "Peter");
            r.setId(3L);
            realisateurService.ajouter(r);
        }
        {
            Realisateur r = new Realisateur("Tarantino", "Quentin");
            r.setId(4L);
            realisateurService.ajouter(r);
        }
        {
            Realisateur r = new Realisateur("Maiwenn", " ");
            r.setId(5L);
            realisateurService.ajouter(r);
        }

        //Film
        {
            Pays p = paysService.rechercherParId(2L);
            Genre g = genreService.rechercherParId(1L);
            Film f = new Film(1L, "Djano", "blabla", 2012L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(4L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(2L);
            Genre g = genreService.rechercherParId(1L);
            Film f = new Film(2L, "Kill Bill", "blabla", 2003L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(4L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(2L);
            Genre g = genreService.rechercherParId(1L);
            Film f = new Film(3L, "Kill Bill2", "blabla", 2004L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(4L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(2L);
            Genre g = genreService.rechercherParId(1L);
            Film f = new Film(4L, "Jackie Brown", "blabla", 1997L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(4L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(1L);
            Genre g = genreService.rechercherParId(2L);
            Film f = new Film(5L, "Sin City", "blabla", 2005L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(4L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(5L);
            Genre g = genreService.rechercherParId(2L);
            Film f = new Film(6L, "Bad Taste", "blabla", 1987L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(3L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(5L);
            Genre g = genreService.rechercherParId(2L);
            Film f = new Film(7L, "Braindead", "blabla", 1992L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(3L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(5L);
            Genre g = genreService.rechercherParId(2L);
            Film f = new Film(8L, "Le Hobbit", "blabla", 2015L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(3L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(3L);
            Genre g = genreService.rechercherParId(1L);
            Film f = new Film(9L, "Polisse", "blabla", 2011L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(5L);
            r.getFilms().add(f);
            f.getRealisateurs().add(r);
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(2L);
            Genre g = genreService.rechercherParId(6L);
            Film f = new Film(10L, "Big Lebowski", "blabla", 1998L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(1L);
            Realisateur r2 = realisateurService.rechercherParId(2L);
            r.getFilms().add(f);
            r2.getFilms().add(f);
            f.getRealisateurs().add(r);
            f.getRealisateurs().add(r2);    
            filmService.ajouter(f);
        }
        {
            Pays p = paysService.rechercherParId(2L);
            Genre g = genreService.rechercherParId(6L);
            Film f = new Film(11L, "AV Cesar", "blabla", 2016L, p, g);
            p.getPaysFilm().add(f);
            g.getGenreFilm().add(f);
            Realisateur r = realisateurService.rechercherParId(1L);
            Realisateur r2 = realisateurService.rechercherParId(2L);
            r.getFilms().add(f);
            r2.getFilms().add(f);
            f.getRealisateurs().add(r);
            f.getRealisateurs().add(r2);    
            filmService.ajouter(f);
        }

        

    }

//    @Test
    public void listerGenre() {
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT g FROM Genre g").getResultList());
        
//        System.out.println(genreService.listerTous().toString());
        
    }
    
    
//    @Test
    public void ordreChrono(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
//        films = em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.nom='Fantastique' ").getResultList();
        films = em.createQuery("SELECT f FROM Film f WHERE f.genre.nom='Fantastique' ORDER BY f.titre").getResultList();
        
         for(Film f : films)
            System.out.println(f.getTitre());
    }
    
//    @Test
    public void req6(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
        films = em.createQuery("SELECT f FROM Film f JOIN f.genre g JOIN f.realisateurs r WHERE g.nom='Action' AND r.nom='Cohen'").getResultList();        
         for(Film f : films)
            System.out.println(f.getTitre());
    }
    
//    @Test
    public void req7(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
        films = em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.nom!='Action'").getResultList();        
         for(Film f : films)
            System.out.println(f.getTitre());
    }
    
//    @Test
    public void req8(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
        films = em.createQuery("SELECT f FROM Film f JOIN f.pays p JOIN f.genre g WHERE p.nom='NZ' AND g.nom!='Fantastique'").getResultList();        
         for(Film f : films)
            System.out.println(f.getTitre());
    }
    
//    @Test
    public void req9(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
       
        Object l = em.createQuery("SELECT COUNT(f) FROM Film f JOIN f.pays p JOIN f.genre g JOIN f.realisateurs r WHERE p.nom='NZ' AND g.nom='Fantastique' AND r.nom='Jackson'").getSingleResult();       
        System.out.println(l);
    }
    
//    @Test
    public void req10a(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
        films = em.createQuery("SELECT f FROM Film f JOIN f.realisateurs r WHERE r.prenom='Joel' AND r.nom='Cohen' INTERSECT "
                             + "SELECT f FROM Film f JOIN f.realisateurs r WHERE r.prenom='Ethan' AND r.nom='Cohen'").getResultList();        
         for(Film f : films)
            System.out.println(f.getTitre());
    }
    
//    @Test
    public void req10b(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
        films = em.createQuery("SELECT f FROM Film f WHERE f.id IN "
                + "(SELECT f1.id FROM Film f1 JOIN f1.realisateurs r WHERE r.prenom='Joel' AND r.nom='Cohen') AND f.id IN"
                + "(SELECT f2.id FROM Film f2 JOIN f2.realisateurs r WHERE r.prenom='Ethan' AND r.nom='Cohen')").getResultList();        
         for(Film f : films)
            System.out.println(f.getTitre());
    }
    
//    @Test
    public void req11(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
        Long nbr = (Long) em.createQuery("SELECT MIN(f.annee) FROM Film f JOIN f.realisateurs r WHERE r.nom='Jackson'").getSingleResult();        
        System.out.println(nbr);
    }
    
    @Test
    public void req12(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Film> films = new ArrayList<>();
        Object av = em.createQuery("SELECT AVG(f.annee) FROM Film f").getSingleResult();        
        System.out.println(av);
    }
    
//        @Test
    public void req13(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Object[]> rf = em.createQuery("SELECT r, COUNT(f) FROM Realisateur r JOIN r.films f GROUP BY r").getResultList();        
        for(Object[] tabObj : rf){
            Realisateur r = (Realisateur) tabObj[0];
            Long l = (Long) tabObj[1];
            System.out.println(r.GetPrenom()+ " " + r.GetNom() + " nombres de films réalisés :  " + l);
        }
            
    }
    
    
}
