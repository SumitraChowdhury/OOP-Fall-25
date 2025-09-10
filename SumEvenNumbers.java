
package com.mycompany.sumevennumbers;

public class SumEvenNumbers {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 2; i <= n; i += 2) 
        {
            sum += i;
        }
        System.out.println("Sum of even numbers = " + sum);
    }
}
