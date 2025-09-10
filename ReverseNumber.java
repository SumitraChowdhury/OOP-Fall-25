
package com.mycompany.reversenumber;

public class ReverseNumber {

    public static void main(String[] args) {
        
        int num = 54;
        int reverse = 0;

        while (num != 0) 
        {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number = " + reverse);
    }
}
