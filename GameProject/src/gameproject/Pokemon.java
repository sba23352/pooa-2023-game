/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Lecturer
 */
public class Pokemon {
    // Variables
    private final String name;
    private int health;
    private String abilities;
    
    //constructor for variables
    public Pokemon(String name , int health, String abilities) {
        this.name = name;
        this.health = health;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getAbilities() {
        return abilities;
    }
    
    
    
    
    
    
    public void takeDamage(int damage) {
        
    }
}
