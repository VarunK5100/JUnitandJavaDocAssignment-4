/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPatternTest;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import factorypattern.ShapeFactory;

/**
 *
 * @author varun
 */
public class javaFactoryTest {
     @Test
    public void fpTest1() {
       ShapeFactory shape=new ShapeFactory();
        assertEquals("Rectangle.draw()",shape.getShape("Rectangle").draw());
       
    }
    @Test
        public void fpTest2(){
        ShapeFactory shape=new ShapeFactory();
        assertNotEquals(shape.getShape("Square").draw(),shape.getShape("Circle").draw());
    }
        
        @Test
        public void fpTest3(){
       ShapeFactory shape=new ShapeFactory();
        assertNull(shape.getShape("Triangle"));
    }
}
