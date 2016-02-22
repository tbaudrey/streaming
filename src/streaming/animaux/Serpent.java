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
public class Serpent extends Animal {
    
    private int i=1;

    @Override
    public void avance() {
        if (i%2==0){
            x++;
            z=z-1;
            i++;
        }
        else{
            x++;
            z=z+1;
            i++;
        }
    }
    
    @Override
    public String toString() {
        return "Serpent ; " + super.toString();
    }
    
}
