/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafacade;

/**
 *
 * @author varun
 */

/** makes a shapeMaker object which calls the method for each shape **/
public class FacadePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeMaker shapemaker=new ShapeMaker();
        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }
    
}
