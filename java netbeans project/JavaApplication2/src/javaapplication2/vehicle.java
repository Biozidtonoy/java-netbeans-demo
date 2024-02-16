/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author tonoy
 */
public class vehicle {
    String brand = "ford";
    String wheel = "Alevel";
    String sound ;
    
    
    vehicle(){
        System.out.println("Constructor call");
    }
    
    public vehicle carSound(String sound){
        this.sound = sound;
        return this;
    }
    void display(){
        System.out.println("sound="+sound);
    }
}

class Car extends vehicle {
    String modelName= "audi";
    int seat=4;
    public int speedMax(int x){  
        return x;
//        System.out.println("");
    }
    public static void main(String[] args) {
        Car c = new Car();
        vehicle v = new vehicle();
        v.carSound("aaahhh aaaahhh").display();
        int speedMax = c.speedMax(450);
        System.out.println("speed="+speedMax+" \n"+c.brand+" \n"+"total seat="+c.seat+"\nwheel model="+c.wheel);
    }   
}
class Bus extends Car{
    private String modelName = "mastang";
    public static void main(String[] args){
        Bus b = new Bus();
        int speedMax = b.speedMax(120);
        System.out.println("max speed of bus="+speedMax+" "+b.brand+" "+ b.modelName+" "+b.wheel);
    }
}
class Jeep extends Car{
    public static void main(String[] args) {
        Jeep j = new Jeep();
        vehicle v = new vehicle();
        String sound1 = j.sound;
        int speedmax = j.speedMax(300);
        v.carSound("ghew ghew").display();
        System.out.println(sound1);
        
                
    }
}
