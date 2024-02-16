/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author tonoy
 */
public class methodChaining {
    public int a ;
    public float b;
    
    methodChaining(){
        System.out.println("Constructor Call");
    }
    public methodChaining setint(int a){
        this.a = a;
        return this;
    }
    void display(){
        System.out.println("DIsplay \n"+ a);
    }
    public static void main(String[] args) {
        methodChaining test = new methodChaining () ;
        test.display();
    }
  
}

