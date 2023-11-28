/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadeTesting;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javafacade.ShapeMaker;
/**
 *
 * @author varun
 */
public class FacadeTest {
   
    
     @Test
    public void facadeTest1() {
       ShapeMaker shapemaker=new ShapeMaker();
        assertEquals("Circle",shapemaker.drawCircle());
       
    }
    @Test
        public void facadeTest2(){
        ShapeMaker shapemaker=new ShapeMaker();
        assertNotEquals(shapemaker.drawRectangle(),shapemaker.drawSquare());
    }
        
         @Test
        public void facadeTest3(){
        ShapeMaker shapemaker=new ShapeMaker();
        assertEquals(   shapemaker.drawCircle(),shapemaker.drawCircle());
    }
}
