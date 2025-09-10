
package com.mycompany.firstlastdigit;

public class FirstLastDigit {

    public static void main(String[] args) {
        
        int num = 110;

        int lastDigit = num % 10;
        int firstDigit = num;

        while (firstDigit >= 10) 
        {
            firstDigit /= 10;
        }

        System.out.println("First digit = " + firstDigit);
        System.out.println("Last digit = " + lastDigit);
    }
}
