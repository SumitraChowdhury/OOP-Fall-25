
package com.mycompany.gcdandlcm;

public class GcdAndLcm {

    public static void main(String[] args) {
     
        int num1 = 12;
        int num2 = 18;

        int gcd = 1;

        
        for (int i = 1; i <= num1 && i <= num2; i++) 
        {
            if (num1 % i == 0 && num2 % i == 0) 
            {
                gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
    }
}
