/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Brown
 * 
 * This is all of my work
 */
public class Defense extends NFLPlayer {
    public double tackles;
    public double sacks;
    public double fumblescaused;
    public double interceptions;
    public double touchdowns;
    public double fourtyyarddash;    

    public Defense(String playername, String position, String experience, int age,
        double heightFeet, double heightInches, double weight, double tackles, 
        double sacks, double fumblescaused, double interceptions, double touchdowns, 
        double fourtyyarddash) {
        this.playername = playername;
        this.position = position;
        this.experience = experience;
        this.age =age;
        this.heightFeet =heightFeet;
        this.heightInches = heightInches;
        this.weight = weight;
        this.tackles =  tackles;
        this.sacks = sacks;
        this.fumblescaused = fumblescaused;
        this.touchdowns = touchdowns;
        this.interceptions = interceptions;
        this.fourtyyarddash = fourtyyarddash;
    }

    @Override
    public String toString() {
        return "Defensive Player: " + this.playername;
    }
   
    public double getTDSPerPick() {
        return touchdowns / interceptions;
    }
    /** Return the yards per attempt
     * @return  */
    public double getSacksPerTackle() {
        return sacks / tackles;
    }
    public void setTackles (int newTackles) { 
        sacks = newTackles;
    }
     public double getTackles() { 
        return tackles;
     }
    /** Set new completions
     * @param newSacks */
    public void setSacks (int newSacks) { 
        sacks = newSacks;
    }
     public double getSacks() { 
        return sacks;
     }
    /** Set new totalyards
     * @param newFumblesCaused */
    public void setFumblesCaused (int newFumblesCaused) { 
        fumblescaused = newFumblesCaused;
    }
     public double getFumblesCaused() { 
        return fumblescaused;
     }
    /** Set new interceptions 
     * @param newInterceptions */
    public void setInterceptions (int newInterceptions) { 
        interceptions = newInterceptions;
    }
     public double getInterceptions() { 
        return interceptions;
     }
    public void setFourtyYardDash (int newFourtyYardDash) { 
        fourtyyarddash = newFourtyYardDash;
}  
     public double getFourtyYardDash() { 
        return fourtyyarddash;
     }
}
