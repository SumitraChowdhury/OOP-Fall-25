
package com.mycompany.sumoddnumbers;

public class SumOddNumbers {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i += 2) 
        {
            sum += i;
        }
        System.out.println("Sum of odd numbers = " + sum);
    }
}
