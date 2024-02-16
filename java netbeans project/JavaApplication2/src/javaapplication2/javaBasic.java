/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author tonoy
 */
public class javaBasic {
    int x;  // attribute
    int y;  //attribute
    int sum ;
    int sub ;
    
    
    javaBasic(){
        System.out.println("Construstor call");
    }
    public javaBasic addition(int x,int y){
        this.x=x;
        this.y=y;
        this.sum =x+y ;
//        System.out.println("sum="+sum);
        return this;
    }
    
    public javaBasic substruction(int x,int y){
        this.x=x;
        this.y=y;
        this.sub = x-y;
//        System.out.println("sub="+sub);
        return this;
    }
    void display(){
        System.out.println("Display \n"+"addition="+sum+"\n"+"substruction="+sub);
    }
    

    
}
class Main{
    public static void main(String[] args) {
        javaBasic basic = new javaBasic();
        basic.addition(33,20).substruction(100, 20).display();
        
    }
}

