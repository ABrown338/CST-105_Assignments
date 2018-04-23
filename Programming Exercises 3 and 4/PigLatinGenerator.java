/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pig.latingenerator;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class PigLatinGenerator {
    public static void main(String[] args) throws Exception {
        int foundvowel = 0;
        char[] vowelsb = {'a','e','o','i','u','y'};
        File file = new File("filepl.txt");
        file.setReadable(true);
        // Read lines from the file until no more are left.
        Scanner inputFile = new Scanner(file);
        // Read lines from the file until no more are left.
        while (inputFile.hasNext()) {
            // Read the next name.
            String str = inputFile.nextLine();
            str = str.replaceAll("\\r\\n", "");

           //String str = "filepl";
            String[] splitStr = str.trim().split("\\s+");
            for (String word: splitStr) {
                String vowels = "aeiouy";
                if (vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                    String OrigionalWord = word + "way";
                    String UpperOriginalWord = OrigionalWord.toUpperCase();
                    System.out.println(word + " " + UpperOriginalWord);
                } else {
                    String wordLowered =  word.toLowerCase();
                    outerloop:
                    for (int i=0; i < wordLowered.length(); i++) {
                        for (int j=0; j < vowelsb.length; j++) {
                            if (wordLowered.charAt(i) == vowelsb[j]){  
                                foundvowel = i;
                                break outerloop;
                            }
                        }
                    }
                    String beginning = word.substring(0,foundvowel);
                    String ending = word.substring(foundvowel);
                    String plword = ending + beginning + "ay";
                    String Upperplword = plword.toUpperCase();
                    System.out.println(word + " " + Upperplword);
                }
            }
        }
    }
}
