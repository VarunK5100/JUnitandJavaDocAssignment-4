/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafacade;

/**
 *
 * @author varun
 */
public class Square implements Shape {

    @Override
    public String draw() {
        System.out.println(" draw a square : Square.draw()");
        String drawShape="Square";
        return drawShape;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
