/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author varun
 */
/** Circle class implementing Shape **/
public class Circle implements Shape {
/** draw method inside Circle class; returns a string that denotes the method being run**/ 
    @Override
    public String draw() {
        System.out.println("draw a circle : Circle.draw();");
        return "Circle.draw()";
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}