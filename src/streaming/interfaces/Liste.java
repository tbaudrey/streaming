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
public class Liste implements Collection,Affichables {
    
    int nbElem=0;
    Object[] tabObjects = new Object[10];

    @Override
    public void ajouter(Object o) {
        tabObjects[nbElem]=o;
        nbElem++;
    }

    @Override
    public Object getObject(int i) {
        return tabObjects[i];
    }

    @Override
    public int taille() {
        return nbElem;
    }

    @Override
    public void afficher() {
        for(int i=0; i<nbElem ; i++){
            System.out.println(tabObjects[i].toString());
        }
    }
    
    
    
}
