/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.digit.addition;
import java.util.Scanner;

/**
 *
 * @author Valerie
 */
public class DigitAddition {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a 5-digit positivve integer:  [30458]");
       int number = input.nextInt();
       int digit1 = number % 10;
       int quotient1 = number / 10;
       int digit2 = quotient1 % 10;
       int quotient2 = quotient1 / 10;
       int digit3 = quotient2 % 10;
       int quotient3 = quotient2 / 10;
       int digit4 = quotient3 % 10;
       int quotient4 = quotient3 / 10;
       int digit5 = quotient4 % 10;
       int total = (digit1 + digit2 + digit3 + digit4 + digit5);
       System.out.println( "The sum of the digits is " + digit5 + " + " + digit4 + " + " + digit3 + " + " + digit2 + " + " + digit1 + " = " + total );
    }
    
}

