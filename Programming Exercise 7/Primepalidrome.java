/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primepalidrome;

/**
 *
 * @author Alex Brown
 * 
 * This is all of my work
 */
public class Primepalidrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primeCounter = 1;
        System.out.println("Palindromic Primes");
        for (int myNumber = 2; myNumber <= 1000000; myNumber++) {
            if(isPrime(myNumber)) {
                if (isPalindromic(myNumber)) {
                    //System.out.print(myNumber + " ");
                    System.out.format("%-5d ", myNumber);
                    if (primeCounter % 4 == 0) {
                        System.out.println(" ");   
                    }
                    primeCounter++;
                }
            } else {
                //System.out.println(myNumber + " is not prime");
            }
        } 
        System.out.println(" ");
    }
        
    /**
     *
     * @param myNumber
     * @return 
     */
    public static boolean isPrime (int myNumber) { 
        int mySqrt = (int) Math.rint(Math.sqrt(myNumber));
        for (int i = 2; i <= mySqrt; i++) {
            int currentRemainder = myNumber % i;
            //System.out.println("mySqrt " + mySqrt + " currentRemainder " + currentRemainder + " myNumber " + myNumber + " i " + i);
            if (currentRemainder == 0) {
                return false;
            }
        }
        return true;
    }
//This work is done by me, ALex Brown, it i smy work
    /**
     *
     * @param myNumber
     * @return 
     */
    public static boolean isPalindromic (int myNumber) {
        String numberString = String.valueOf(myNumber);
        int length = numberString.length();
        int beginCount = 0;
        int endCount = length;
        if (length == 1) {
            return true;
        } else {
            while (endCount - beginCount > 1) {
                String beginChar = numberString.substring(beginCount,beginCount + 1);
                String endChar = numberString.substring(endCount - 1, endCount);
                if (beginChar == null ? endChar != null : !beginChar.equals(endChar)) {
                    return false;
                } 
                beginCount++;
                endCount--;
            }
            return true;
        }
    }
}

