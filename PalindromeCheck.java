
package com.mycompany.palindromecheck;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        int num = 121;
        int original = num;
        int reverse = 0;

        while (num != 0) 
        {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        if (original == reverse) 
        {
            System.out.println("The number is a palindrome.");
        } 
        else 
        {
            System.out.println("The number is not a palindrome.");
        }
    }
}
