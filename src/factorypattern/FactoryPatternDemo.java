/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypattern;

/**
 *
 * @author varun
 */

/** Class FactoryPatternDemo, used to create a shapeFactory object.shape1 object created through which getShape method is called with an argument, which then calls the draw method of the argument passed**/
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ShapeFactory shapeFactory=new ShapeFactory();
        
        
        Shape shape1= shapeFactory.getShape("Rectangle");
        shape1.draw();
        // TODO code application logic here
    }
    
}
