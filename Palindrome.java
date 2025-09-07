
package com.mycompany.palindrome;

public class Palindrome {

    public static void main(String[] args) {
        
        String original = "Madam";

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
            
        } 
        
        else 
        {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}
