/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.RealisateurDAO;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class RealisateurService {
    
    private RealisateurDAO dao= new RealisateurDAO();
    
    
    public void ajouter(Realisateur r){
        dao.ajouter(r);
    }
    
    public void modifier(Realisateur r){
        dao.modifier(r);
    }
    
    public void supprimer(Realisateur r){
        dao.supprimer(r);
    }
    
    public Realisateur rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    public List<Realisateur> listerTous(){
        return dao.listerTous();
    }
    
}
