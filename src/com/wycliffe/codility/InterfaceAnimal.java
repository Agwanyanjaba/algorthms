/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
//Code to test Animal
/*
1.Create Interface with a method to be implemented 
2. Craete the implemented class to inherit the Interface class properties
3. Driver class 
*/
interface Animal {
    public void sleep();//Does not have a body
    public void animalSound();//Doews not have a body
    
}
interface Mammals {
    public void locomote();//Does not have a body
    //public void animalSound();//Doews not have a body
    
}
class InterfaceAnimal implements Animal, Mammals{

    @Override
    public void sleep() {
        System.out.println("WHIZZZZZZ");
    }

    @Override
    public void animalSound() {
        System.out.println("Dog barks");
      
    }
    @Override
    public void locomote() {
        System.out.println("Moves from one place to another");
    }
    
    public static void main(String args[]){
        InterfaceAnimal animalObject = new InterfaceAnimal();
        animalObject.sleep();
        animalObject.animalSound();
        animalObject.locomote();
    }
   
}

