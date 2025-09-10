
package com.mycompany.countdigits;

public class CountDigits {

    public static void main(String[] args) {
        
        int num = 30;
        int count = 0;

        while (num != 0) 
        {
            num /= 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}
