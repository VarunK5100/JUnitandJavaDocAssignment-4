/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonclass;

/**
 *
 * @author varun
 */

/** Only allows the creation of one object from the class and all methods inside  **/
public class SingleObject {
    private static SingleObject instance=new SingleObject();
    private int sum=0;
    private SingleObject(){   
    }

    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
       System.out.println("Hello World");
    }
    public int performAddition(int a, int b){
         sum=sum+a+b;
        System.out.println("sum is:"+sum);
        return sum;
    }
}
