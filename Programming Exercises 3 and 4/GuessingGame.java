/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        int answer = (int )(Math.random() * 10000 + 1);
        int guess = 0;
        int highnum = 10000;
        int lownum = 1;
        int guesscnt = 0;
        Scanner input =new Scanner(System.in);
        while (guess != answer) {
            System.out.print("Enter a guess between " + lownum + " and " + highnum + ": ");
            guess = input.nextInt();
            guesscnt += 1;

            if (guess < answer) {
                System.out.println("HIGHER");
                lownum = guess + 1;
            }
            else if (guess > answer) {
                System.out.println("LOWER");
                highnum = guess - 1;
            }
        }
        System.out.println("You WIN. It took you " + guesscnt + " guesses");
    }
    
}
