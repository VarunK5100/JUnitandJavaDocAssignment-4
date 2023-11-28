/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonclass;

/**
 *
 * @author varun
 */
/** here SingleObject class's object is called through the getInstance method instead of the conventional way of creating a object with the new keyword **/
public class SingletonClass {

    /**
     * @param args the command line arguments
     */
    /** 2 objects are called with reference to the same instance to depict how data from the first performAddition is stored when the second object is called**/
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject object=SingleObject.getInstance();
        object.showMessage();
        object.performAddition(3, 2);
        
        SingleObject object2=SingleObject.getInstance();
        object2.performAddition(4, 5);
        
        
    }
    
}
