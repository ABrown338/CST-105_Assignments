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
public class Offense extends NFLPlayer {
public double touchdowns;
public double totalyards;
public double interceptions;
public double completions;
public double attempts;
public double fourtyyarddash;
    
    public Offense(String playername, String position, String experience, int age,
        double heightFeet, double heightInches, double weight, double attempts, 
        double completions, double totalyards, double touchdowns, double interceptions, 
        double fourtyyarddash) {
        this.playername = playername;
        this.position = position;
        this.experience = experience;
        this.age =age;
        this.heightFeet =heightFeet;
        this.heightInches = heightInches;
        this.weight = weight;
        this.attempts =  attempts;
        this.completions = completions;
        this.totalyards = totalyards;
        this.touchdowns = touchdowns;
        this.interceptions = interceptions;
        this.fourtyyarddash = fourtyyarddash;
    }
    
    @Override
    public String toString() {
 	return "Offensive Player: " + this.playername;
    }
    
 /** Return the completion percentage
     * @return  */
    public double getCompletionPercentage() {
        //System.out.println("completions " + completions + " attempts " + attempts);
        return completions / attempts * 100;
    }
    /** Return the yards per attempt
     * @return  */
    public double getYardsPerAttempt() {
        return totalyards / attempts;
    }
    /** Set new position 
     * @param newAttempts */
    public void setAttempts (int newAttempts) { 
        attempts = newAttempts;
    }
     public double getAttempts() { 
        return attempts;
    }
    /** Set new completions 
     * @param newCompletions */
    public void setCompletions (int newCompletions) { 
        completions = newCompletions;
    }
    public double getCompletions() { 
        return completions;
    }
    /** Set new totalyards
     * @param newTotalYards */
    public void setTotalYards (int newTotalYards) { 
        totalyards = newTotalYards;
    }
       public double getTotalYards() { 
        return totalyards;
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
  


