/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonTesting;

import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import singletonclass.SingleObject;
/**
 *
 * @author varun
 */
public class SingletonTest {
    
/**
 *
 * @author varun
 **/
    
    @Test
    public void SingleTonTest() {
       SingleObject object=SingleObject.getInstance();
       SingleObject object2=SingleObject.getInstance();
        //object.showMessage();
        assertEquals(5, object.performAddition(3, 2));
        assertNotEquals(13, object.performAddition(9,4));
       
    }
 

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}


