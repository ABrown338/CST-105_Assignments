/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farentocelcius;
import java.util.Scanner;
/**
 *
 * @author Valerie
 */
public class FarenToCelcius {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter a Fahrenheit Temperature: ");
    double fahrenheit = input.nextDouble();
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println( fahrenheit + " F is equilvalent to " +
            celsius + " C ");    
    System.out.print(" Enter a Celsius Temperature: ");
    double celcius = input.nextDouble();
    double farenheit = (9.0/5) * (celcius) + (32);
    System.out.println( celcius + " C is equililant to " +
            farenheit + " F ");
}

}
