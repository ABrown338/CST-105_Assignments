/**
 *
 * @author Alex Brown
 * 
 * This is all of my work
 */
public abstract class NFLPlayer {
    //** The elements of quarterback statistics */
    public String playername; 
    public String position;
    public String experience;
    public int age;
    public double heightFeet;
    public double heightInches;
    public double weight;

    public NFLPlayer(){
    }
    public NFLPlayer(String playername, String position, String experience, int age, double heightFeet, int heightInches, int weight){
        this.playername = playername;
        this.position = position;
        this.experience = experience;
        this.age =age;
        this.heightFeet =heightFeet;
        this.heightInches = heightInches;
        this.weight = weight;
    }
    /** Set new playername 
     * @param newPlayername */
    public void setPlayername(String newPlayername) { 
        playername = newPlayername;
    }
     public String getPlayerName() { 
        return playername;
    }
    /** Set new position 
     * @param newPosition */
    public void setPosition (String newPosition) { 
        position = newPosition;
    }
    public String getPosition() { 
        return position;
    }   
    /** Set new age 
     * @param newAge */
    public void setAge (int newAge) { 
        age = newAge;
    }
    public int getAge() { 
        return age;  
    }    
    /** Set new heightFeet 
     * @param newHeightFeet */
    public void setHeightFeet (int newHeightFeet) { 
        heightFeet = newHeightFeet;
    }
     public double getHeightFeet() { 
        return heightFeet;
    }
    /** Set new heightInches 
     * @param newHeightInches */
    public void setHeightInches (int newHeightInches) { 
        heightInches = newHeightInches;
    }
     public double getHeightInches() { 
        return heightInches;
    }
    /** Set new weight 
     * @param newWeight */
    public void setPosition (int newWeight) { 
        weight = newWeight;
    }
     public double getWeight() { 
        return weight;
    }
}