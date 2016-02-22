/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import javax.persistence.Persistence;
import org.junit.Test;
import streaming.enumerations.TypeUtil;
import streaming.interfaces.Ensemble;
import streaming.interfaces.Liste;

/**
 *
 * @author admin
 */
public class RelationTest {
    
    @Test
    public void testRelation(){
        
       Persistence.createEntityManagerFactory("StreamingPU");

    }
    
}
