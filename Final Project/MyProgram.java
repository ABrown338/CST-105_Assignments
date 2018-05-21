//This work is all my own, Alex Brown
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyProgram {
    public static void main(String args[]) {
        JFrame myJFrame = new JFrame("Main Screen");
        JPanel panel = new JPanel();
        Container cp = myJFrame.getContentPane();
        JButton button1 = new JButton("Offense");
        JButton button2 = new JButton("Defense");
        JButton button3 = new JButton("My Roster");
        ImageIcon ic3 = new ImageIcon("image/football.jfif");
        JButton button4 = new JButton(ic3);
        
        panel.setLayout(new GridLayout(2,2));
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        ActionListener al = (ActionEvent e) -> {
            //myJFrame.setVisible(false);
            cp.removeAll();
            myJFrame.setSize(700,200);
            JPanel Panel1 = new JPanel();
            cp.add(Panel1);
            cp.validate();

            NFLPlayer player1 = new Offense("Baker Mayfield", "QB", "Senior", 23, 6, 1, 235, 500, 300, 5000, 35, 5, 4.3);
            NFLPlayer player2 = new Offense("Sequan Barkley", "RB", "Senior", 22, 6, 2, 220, 300, 0, 3000, 20, 0, 4.2);
            NFLPlayer player3 = new Offense("Adam Theilan", "WR", "Junior", 21, 6, 3, 210, 0, 0, 2000, 10, 0, 4.25);
            NFLPlayer player4 = new Offense("Nick Chubb", "RB", "Senior", 22, 6, 1, 215, 500, 0, 2500, 25, 0, 4.21);
            NFLPlayer player5 = new Offense("Stephon Diggs", "WR", "Senior", 22, 6, 2, 205, 200, 0, 1500, 12, 0, 4.23);
            NFLPlayer player6 = new Offense("Dalvin Cook", "RB", "Senior", 22, 6, 1, 220, 350, 0, 2700, 18, 0, 4.24);

            //headers for the table
            String[] columns = new String[] {
                //"Id", "Name", "Hourly Rate", "Part Time"
                "Selection", "Player Name", "Position", "Experience", "Age", "Height (Feet)", "Height (Inches)", "Weight"
            };

            //actual data for the table in a 2d array
            Object[][] data = new Object[][] {
                { "select", player1.playername, player1.position, player1.experience, player1.age, player1.heightFeet, player1.heightInches, player1.weight },
                { "select", player2.playername, player2.position, player2.experience, player2.age, player2.heightFeet, player2.heightInches, player2.weight },
                { "select", player3.playername, player3.position, player3.experience, player3.age, player3.heightFeet, player3.heightInches, player3.weight },
                { "select", player4.playername, player4.position, player4.experience, player4.age, player4.heightFeet, player4.heightInches, player4.weight },
                { "select", player5.playername, player5.position, player5.experience, player5.age, player5.heightFeet, player5.heightInches, player5.weight },
                { "select", player6.playername, player6.position, player6.experience, player6.age, player6.heightFeet, player6.heightInches, player6.weight }, 
            };
            //create table with data
            JTable table = new JTable(data, columns);

            //add the table to the frame
            cp.add(new JScrollPane(table));
            //JScrollPane scroll = new JScrollPane(table);
            //cp.setTitle("Table Example");
            //cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
            //cp.pack();
            cp.setVisible(true);
        };
        ActionListener al_2 = (ActionEvent e) -> {
            cp.removeAll();
            myJFrame.setSize(700,200);
            JPanel Panel2 = new JPanel();
            cp.add(Panel2);
            cp.validate();
            //headers for the table

            NFLPlayer player1 = new Defense("Harrison Smith", "S", "Senior", 22, 6, 2, 210, 150, 2, 2, 4, 3, 4.3);
            NFLPlayer player2 = new Defense("Von Miller", "LB", "Senior", 22, 6, 4, 230, 220, 20, 5, 0, 0, 4.4);
            NFLPlayer player3 = new Defense("Bradley Robey", "CB", "Senior", 22, 6, 1, 198, 100, 0, 0, 2, 7, 4.23);
            NFLPlayer player4 = new Defense("Demarcus Ware", "DE", "Senior", 22, 6, 5, 245, 280, 15, 3, 0, 0, 4.4);
            NFLPlayer player5 = new Defense("Everson Griffin", "DE", "Senior", 22, 6, 6, 260, 270, 17, 0, 0, 0, 4.6);
            NFLPlayer player6 = new Defense("Bradley Chubb", "LB", "Senior", 22, 6, 5, 260, 200, 23, 4, 0, 0, 4.5);

            //headers for the table
            String[] columns = new String[] {
                //"Id", "Name", "Hourly Rate", "Part Time"
                "Selection", "Player Name", "Position", "Experience", "Age", "Height (Feet)", "Height (Inches)", "Weight"
            };

            //actual data for the table in a 2d array
            Object[][] data = new Object[][] {
                { "select", player1.playername, player1.position, player1.experience, player1.age, player1.heightFeet, player1.heightInches, player1.weight },
                { "select", player2.playername, player2.position, player2.experience, player2.age, player2.heightFeet, player2.heightInches, player2.weight },
                { "select", player3.playername, player3.position, player3.experience, player3.age, player3.heightFeet, player3.heightInches, player3.weight },
                { "select", player4.playername, player4.position, player4.experience, player4.age, player4.heightFeet, player4.heightInches, player4.weight },
                { "select", player5.playername, player5.position, player5.experience, player5.age, player5.heightFeet, player5.heightInches, player5.weight },
                { "select", player6.playername, player6.position, player6.experience, player6.age, player6.heightFeet, player6.heightInches, player6.weight }, 
            };
            //create table with data
            JTable table = new JTable(data, columns);

            //add the table to the frame
            cp.add(new JScrollPane(table));
            //JScrollPane scroll = new JScrollPane(table);
            //cp.setTitle("Table Example");
            //cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
            //cp.pack();
            cp.setVisible(true);
        };
        ActionListener al_3 = (ActionEvent e) -> {
            cp.removeAll();
            myJFrame.setSize(700,200);
            JPanel Panel3 = new JPanel();
            cp.add(Panel3);
            cp.validate();
        };
        
        button1.addActionListener(al);
        button2.addActionListener(al_2);
        button3.addActionListener(al_3);
        cp.add(panel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        myJFrame.setSize(600,500);
        //Puts the window in the middle of the screen.
        myJFrame.setLocationRelativeTo(null);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJFrame.setVisible(true);
    }
}
