/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author varun
 */
/** Circle Rectangle implementing Shape **/
public class Rectangle implements Shape {

   /** draw method inside Rectangle class; returns a string that denotes the method being run**/
    @Override
    public String draw() {
        System.out.println("Rectangle.draw()");
        return "Rectangle.draw()";
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
