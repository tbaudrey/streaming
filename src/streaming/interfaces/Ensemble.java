/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.interfaces;

/**
 *
 * @author admin
 */
public class Ensemble implements Collection, Affichables{
    
    int nbElem=0;
    Object[] tabObjects = new Object[10];

    @Override
    public void ajouter(Object o) {
        
        
        for(int i=0;i<tabObjects.length;i++){
            if(tabObjects[i]==o){
                return;
            }
        }
        tabObjects[nbElem]=o;
        nbElem++;
        
//        int i =0;
//        boolean trouve=false;
//        while(i<=nbElem && trouve==false){
//            
//            if (tabObjects[i]==o){
//                trouve=true;
//            }
//            i++;
//        }
//        if (trouve == false){
//            tabObjects[nbElem]=o;
//            nbElem++;
//        }
            
    }

    @Override
    public int taille() {
        return nbElem;
    }

    @Override
    public Object getObject(int i) {
        return tabObjects[i];
    }


    @Override
    public void afficher() {
        for(int i=0; i<nbElem ; i++){
            System.out.println(tabObjects[i].toString());
        }
    }
    
    
    
}
