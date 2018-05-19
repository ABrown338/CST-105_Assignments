//This work is all my, Alex Browns
package checkerboard; 
    import javax.swing.*;
    import java.awt.Graphics;
    import java.awt.Color;

public class CheckerBoard extends JFrame {

    @Override
    public void paint(Graphics g) {
        int row;
        int col;
        int x;
        int y;

        for ( row = 1;  row < 9;  row++ ) {
            for ( col = 1;  col < 9;  col++) {
                x = col * 50;
                y = row * 50;
                if (((row + col) % 2)==1) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }

                g.fillRect(x, y, 50, 50);
            }
        }
    }

    public static void main(String args[]) {
        CheckerBoard check = new CheckerBoard();
        check.setTitle("CheckerBoard");
        check.setSize(500, 500);
        check.setDefaultCloseOperation(EXIT_ON_CLOSE);
        check.setVisible(true);
    }
}