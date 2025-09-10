
package com.mycompany.sumfirstlastdigit;

public class SumFirstLastDigit {

    public static void main(String[] args) {
        
        int num = 94;

        int lastDigit = num % 10;
        int firstDigit = num;

        while (firstDigit >= 10) 
        {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digit = " + sum);
    }
}
