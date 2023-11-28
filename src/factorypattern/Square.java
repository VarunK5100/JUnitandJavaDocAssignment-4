/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author varun
 */
/** Class Square implementing shape **/
public class Square implements Shape{

     /** draw method inside Square class; returns a string that denotes the method being run**/
    @Override
    public String draw() {
        System.out.println("draw.Square()");
        return "draw.Square()";
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
