/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dimmentionalarray;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) throws Exception {
        char [][] matrix;
        int rows = 20;
        int columns = 45;
        matrix = new char[rows][columns];
        int rowcount = 0;
        int columncount = 0;
        File file = new File("file2.txt");
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
                for (int i=0; i < word.length(); i++) {
                    String currentChar = word.substring(i,i + 1);
                    //System.out.println(currentChar + " " + rowcount + " " + columncount);
                    matrix[rowcount][columncount] = currentChar.charAt(0);
                    columncount ++;
                    if (columncount > columns - 1) {
                        rowcount ++;
                        columncount = 0;
                    }
                }
                //System.out.println(word);
                matrix[rowcount][columncount] = ' ';
                columncount ++;
                if (columncount > columns - 1) {
                    rowcount ++;
                    columncount = 0;
                }
            }
        }
        for (int currentrow = rowcount; currentrow < rows; currentrow ++){
            while (columncount < columns) {
                matrix[currentrow][columncount] = '@';
                columncount ++;
            }
            columncount = 0;
        }

        for (int currentcolumn = 0; currentcolumn < columns; currentcolumn ++){
            for (int currentrow = 0; currentrow < rows; currentrow ++){
                System.out.print(matrix[currentrow][currentcolumn]);
            }
            //System.out.println("");
        }
        System.out.println("");
    }
}
