/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.LienDAO;
import streaming.entity.Genre;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienService {
    
    private LienDAO dao= new LienDAO();
    
    
    public void ajouter(Lien l){
        dao.ajouter(l);
    }
    
    public void modifier(Lien l){
        dao.modifier(l);
    }
    
    public void supprimer(Lien l){
        dao.supprimer(l);
    }
    
    public Lien rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    public List<Lien> listerTous(){
        return dao.listerTous();
    }
    
}
