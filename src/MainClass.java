/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Olive Menorah
 */
public class MainClass {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println();
        animal.sleep();
        animal.eat();
        bird.eat();
        bird.sleep();
        dog.eat();
        dog.sleep();
        
    }
    
}
