/**
 *
 * @author Alex Brown
 * 
 * This is all of my work
 */
import java.util.*;

public class NFLPlayerManager {
    /**
     * @param args the command line arguments
     */        
    /* Define our array for six players */
    final ArrayList<NFLPlayer> LIST_OF_PLAYERS = new ArrayList<>(); 
    public static void main(String[] args) {
        NFLPlayerManager test = new NFLPlayerManager();
    }
    public NFLPlayerManager() {
        NFLPlayer player1 = new Offense("Baker Mayfield", "QB", "Senior", 23, 6, 1, 235, 500, 300, 5000, 35, 5, 4.3);
        NFLPlayer player2 = new Offense("Sequan Barkley", "RB", "Senior", 22, 6, 2, 220, 300, 0, 3000, 20, 0, 4.2);
        NFLPlayer player3 = new Offense("Adam Theilan", "WR", "Junior", 21, 6, 3, 210, 0, 0, 2000, 10, 0, 4.25);
        NFLPlayer player4 = new Offense("Nick Chubb", "RB", "Senior", 22, 6, 1, 215, 500, 0, 2500, 25, 0, 4.21);
        NFLPlayer player5 = new Offense("Stephon Diggs", "WR", "Senior", 22, 6, 2, 205, 200, 0, 1500, 12, 0, 4.23);
        NFLPlayer player6 = new Offense("Dalvin Cook", "RB", "Senior", 22, 6, 1, 220, 350, 0, 2700, 18, 0, 4.24);
        NFLPlayer player7 = new Defense("Harrison Smith", "S", "Senior", 22, 6, 2, 210, 150, 2, 2, 4, 3, 4.3);
        NFLPlayer player8 = new Defense("Von Miller", "LB", "Senior", 22, 6, 4, 230, 220, 20, 5, 0, 0, 4.4);
        NFLPlayer player9 = new Defense("Bradley Robey", "CB", "Senior", 22, 6, 1, 198, 100, 0, 0, 2, 7, 4.23);
        NFLPlayer player10 = new Defense("Demarcus Ware", "DE", "Senior", 22, 6, 5, 245, 280, 15, 3, 0, 0, 4.4);
        NFLPlayer player11 = new Defense("Everson Griffin", "DE", "Senior", 22, 6, 6, 260, 270, 17, 0, 0, 0, 4.6);
        NFLPlayer player12 = new Defense("Bradley Chubb", "LB", "Senior", 22, 6, 5, 260, 200, 23, 4, 0, 0, 4.5);
        LIST_OF_PLAYERS.add(player1);
        LIST_OF_PLAYERS.add(player2);
        LIST_OF_PLAYERS.add(player3);
        LIST_OF_PLAYERS.add(player4);
        LIST_OF_PLAYERS.add(player5);
        LIST_OF_PLAYERS.add(player6);       
        LIST_OF_PLAYERS.add(player7);       
        LIST_OF_PLAYERS.add(player8);    
        LIST_OF_PLAYERS.add(player9);       
        LIST_OF_PLAYERS.add(player10);       
        LIST_OF_PLAYERS.add(player11);       
        LIST_OF_PLAYERS.add(player12);       
    }
}