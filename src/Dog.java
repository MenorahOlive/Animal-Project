/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Olive Menorah
 */
public class Dog extends Animal{
      public Dog(){
    super();
    System.out.println("A new dog has been created!");
    
    }
      @Override
    public void sleep(){
    System.out.println("A dog sleeps...");
    }
    @Override
    public void eat(){
    System.out.println("A dog eats...");
    }
    
    
}
