/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Olive Menorah
 */
public class Bird extends Animal {
    public Bird(){
    super();
    System.out.println("A new bird has been created!");
    
    }
    @Override
    public void sleep(){
    System.out.println("A bird sleeps...");
    }
    @Override
    public void eat(){
    System.out.println("A bird eats...");
    }
    
    
}
