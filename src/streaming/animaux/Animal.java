/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.animaux;

/**
 *
 * @author admin
 */
public abstract class Animal {
    
    private static int nbInstances =0;
    
    private int i=0;
    
    protected int x=0, y=0, z=0;

    public Animal() {
        nbInstances=nbInstances+1;
    }
    
    public static int getNbInstances(){
        return nbInstances;
    }
    
    public abstract void avance();
    
    public void avance(int n){
        for (i=0; i<n ; i++){
            this.avance();
        }
    }
    
//    public void avance(){
//        this.y=this.y+1;
//        System.out.println("avance");
//    }
//    public void avance(int nbPas){
//        this.y=this.y+nbPas;
//        System.out.println("avance");
//    }
    
//    public void recule(){
//        this.y=this.y-1;
//    }
//    public void recule(int nbPas){
//        this.y=this.y-nbPas;
//    }
//    
//    public void gauche(){
//        this.x=this.x-1;
//    }
//    public void gauche(int nbPas){
//        this.x=this.x-nbPas;
//    }
//    
//    public void droite(){
//        this.x=this.x+1;
//    }
//    public void droite(int nbPas){
//        this.x=this.x+nbPas;
//    }
    
    public String position(){
        return this.getClass() + " " + (x +"," + y + "," + z);
    }
    
    public String toString(){
        return position();
//        return (x +" " + y);
    }
    
    
//    public Animal(){
//        System.out.println("Animal()");
//    }
//    
//    public Animal(int p){
//        System.out.println("Animal(int p)");
//    }
//    
//    public Animal (String p){
//        
//        System.out.println(".Animal(String nom)");
//    }
}
