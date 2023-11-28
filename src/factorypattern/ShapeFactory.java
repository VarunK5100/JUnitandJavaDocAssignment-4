/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author varun
 */
/** class shapeFactory is used to create a method with an object return type. Returns new object of the respective shape **/
public class ShapeFactory {
    
    public Shape getShape(String shapeName){
        if(shapeName==null){
            return null;
        }
        if(shapeName.equalsIgnoreCase("Rectangle")){                
        return new Rectangle();
    }
        else if(shapeName.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapeName.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
    
}
