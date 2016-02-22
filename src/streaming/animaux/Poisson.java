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
public class Poisson extends Animal{

    @Override
    public String toString() {
        return "Poisson ; " + super.toString();
    }
    
//    public void avance(){
//        this.y=this.y+1;
//        System.out.println("nage");
//    }

    @Override
    public void avance() {
        z++;
        y--;
    }
    
    
}
