/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafacade;

/**
 *
 * @author varun
 */
/** implements Shape **/
public class Rectangle implements Shape {
/** returns drawShape when called through ShapeMaker **/
    @Override
    public String draw() {
        System.out.println("Draw a rectangle: Rectangle.draw()");
        String drawShape="Rectangle";
        return drawShape;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
