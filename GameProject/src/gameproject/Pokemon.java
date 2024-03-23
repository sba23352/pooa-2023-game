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
    private int remainingHealth;
    private final int maxHealth;
    private Ability[] abilities;
    
    //constructor for variables
    public Pokemon(String name , int maxHealth, Ability[] abilities) {
        this.name = name;
        this.maxHealth = maxHealth;
        remainingHealth = maxHealth;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public int getRemainingHealth() {
        return remainingHealth;
    }

    public String getAbilities() {
        return abilities;
    }
    
    
    
    
    
    
    public void takeDamage(int damage) {
        
    }
}
