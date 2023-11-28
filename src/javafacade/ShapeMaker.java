/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafacade;

/**
 *
 * @author varun
 */

/** ShapeMaker class declares global objects and initializes them in a method **/
public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;
    /**creates new objects of shape **/
    public ShapeMaker(){
        circle=new Circle();
        square=new Square();
        rectangle=new Rectangle();
    }
    /** returns draw method of circle class **/
    public String drawCircle(){
        //circle.draw();
        return circle.draw();
    }
     /** returns draw method of square class **/
    public String drawSquare(){
        //square.draw();
        return square.draw();
    }
     /** returns draw method of rectangle class **/
    public String drawRectangle(){
        return rectangle.draw();
    }
}
