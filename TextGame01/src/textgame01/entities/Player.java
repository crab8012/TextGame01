package textgame01.entities;
//Imports
import textgame01.Items.*;

public class Player { //We make this serializable to assist with gamesaves.
    private double health;//Always in motion
    private double armour;//Always in motion, decays and takes a percentage off of the health.
    private final double maxArmour = 100;
    private String name;//Player's name. Not Changeable, yet.
    
    private int[] location; //Four values, they are in the order of x1,y1,x2,y2 where x1 and y1 are the world map location and x2 and y2 are the region map location.
    
    //These are counters for miscellaneous statistics
    private int enemiesKilled;
    
    //These are the upgradeable statistics.
    private int endurance;
    private double strength;
    
    //Player Inventory: This will always be a 3x5 grid of objects.
    private Item[][] Inventory;
    
    //Constructors
    public Player(String name, int armour, int endurance, double strength, int[] location, int health){
        this.name = name;
        this.armour = armour;
        this.endurance = endurance;
        this.strength = strength;
        this.location = location;
        this.health = health;
    }
    //Methods 
    public double getHealth(){
        return this.health;
    }
    public void subtractHealth(double n){
        this.health -= n;
        this.checkHealth();
    }
    public void addHealth(double n){
        this.health += n;
        this.checkHealth();
    }
    public void setHealth(double n){
        this.health = n;
        this.checkHealth();
    }
    public void checkHealth(){
        if(this.getHealth() >= 100){
            this.setHealth(100);
        }else if(this.getHealth() <= 0){
            this.die();
        }
    }
    
    
    public double getArmour(){
        return this.armour;
    }
    public void setArmour(double a){
        this.armour = a;
        this.checkArmour();
    }
    public void subtractArmour(double a){
        this.armour -= a;
        this.checkArmour();
    }
    public void addArmour(double a){
        this.armour += a;
        this.checkArmour();
    }
    public void checkArmour(){
        if(this.getArmour() <= 0){
            this.setArmour(0);
        }else if(this.getArmour() >= this.maxArmour){
            this.setArmour(this.maxArmour);
        }
    }
    
    public int getEndurance(){
        return this.endurance;
    }
    public void setEndurance(int e){
        this.endurance = e;
    }
    public void addEndurance(int e){
        this.endurance += e;
    }
    public void subtractEndurance(int e){
        this.endurance -= e;
    }
    
    public double getStrength(){
        return this.strength;
    }
    public void setStrength(int s){
        this.strength = s;
    }
    public void addStrength(int s){
        this.strength += s;
    }
    public void subtractStrength(int s){
        this.strength -= s;
    }
    
    public void updateLocation(int[] location){
        this.location = location;
    }
    public int[] getLocation(){
        return this.location;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void die(){
        System.out.println("You have died. The Game will now reset from zero.");
        System.out.println("Your statistics for this game will now be listed:\n");
        //List Player Statistics
        System.exit(0);//Exit the game.
    }
    
    public String toString(){
        return("Name: " + this.name + " \nHealth: " + this.health + " \nArmour: " + this.armour + " \nEndurance: " + 
                this.endurance + " \nStrength: " + this.strength + 
                " \nLocation: " + this.location[0] + "," + this.location[1] + "," + this.location[2] + "," + this.location[3]);
    }
}
