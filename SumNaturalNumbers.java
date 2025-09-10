
package com.mycompany.sumnaturalnumbers;

public class SumNaturalNumbers {

    public static void main(String[] args) {
        
        int n = 15;
        int sum = 0;

        for (int i = 1; i <= n; i++) 
        {
            sum += i;
        }
        System.out.println("Sum of natural numbers = " + sum);
    }
}
