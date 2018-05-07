public class NFLPlayer {
    /** The elements of quarterback statistics */
    String playername = "Mayfield, Baker";
    String position = "QB";
    String experience = "Senior";
    double age = 23;
    int heightFeet = 6;
    int heightInches = 1;
    int weight = 215;
    double attempts = 1497;
    double completions = 1026;
    double totalyards = 14607;
    double interceptions = 30;
    
    /** Construct a NFLPlayer object without arguments*/ 
    NFLPlayer() {
    }
    
    // This is the constructor of the class NFLPlayer
    // Define all of the properties for the players
    NFLPlayer(String newPlayername, String newPosition, String newExperience, double newAge, int newHeightFeet, int newHeightInches, int newWeight, double newAttempts, double newCompletions, double newTotalyards, double newInterceptions) {
        playername = newPlayername;
        position = newPosition;
        experience = newExperience;
        age = newAge;
        heightFeet = newHeightFeet;
        heightInches = newHeightInches;
        weight = newWeight;
        attempts = newAttempts;
        completions = newCompletions;
        totalyards = newTotalyards;
        interceptions = newInterceptions;
    }
    
    /** Return the completion percentage */
    double getCompletionPercentage() {
        //System.out.println("completions " + completions + " attempts " + attempts);
        return completions / attempts * 100;
    }
    /** Return the yards per attempt */
    double getYardsPerAttempt() {
        return totalyards / attempts;
    }
    /** Set new playername 
     * @param newPlayername */
    public void setPlayername(String newPlayername) { 
        playername = newPlayername;
    }
    /** Set new position 
     * @param newPosition */
    public void setPosition (String newPosition) { 
        playername = newPosition;
    }
    /** Set new age 
     * @param newAge */
    public void setAge (int newAge) { 
        age = newAge;
    }
    /** Set new heightFeet 
     * @param newHeightFeet */
    public void setHeightFeet (int newHeightFeet) { 
        heightFeet = newHeightFeet;
    }
    /** Set new heightInches 
     * @param newHeightInches */
    public void setHeightInches (int newHeightInches) { 
        heightInches = newHeightInches;
    }
    /** Set new weight 
     * @param newWeight */
    public void setPosition (int newWeight) { 
        weight = newWeight;
    }
    /** Set new position 
     * @param newAttempts */
    public void setAttempts (int newAttempts) { 
        attempts = newAttempts;
    }
    /** Set new completions 
     * @param newCompletions */
    public void setCompletions (int newCompletions) { 
        completions = newCompletions;
    }
    /** Set new totalyards 
     * @param newTotalyards */
    public void setTotalyards (int newTotalyards) { 
        totalyards = newTotalyards;
    }
    /** Set new interceptions 
     * @param newInterceptions */
    public void setInterceptions (int newInterceptions) { 
        interceptions = newInterceptions;
    }
    /* Output the player information */
    public void printNFLPlayer() {
        System.out.println("Name: " + playername ); 
        System.out.println("Position: " + position );
        System.out.println(experience + ", Age: " + age);
        System.out.println("Height: " + heightFeet + " Feet " + heightInches + " Inches");
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Comp: "  + completions );
        System.out.println("Att: " + attempts );
        System.out.println("Pct: " + getCompletionPercentage());
        System.out.println("Yds: " + totalyards);
        System.out.println("Y/A:" +  getYardsPerAttempt());
        System.out.println("Int:" + interceptions);
    }
}