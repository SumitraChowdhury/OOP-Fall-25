
package com.mycompany.theoddlanternparade;

public class TheOddLanternParade {

    public static void main(String[] args) {
        
        int terms = 10;
        int sum = 0;

        System.out.print("The odd numbers are :");

        for (int i = 1; i <= terms; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
            sum += odd;
        }

        System.out.println();
        System.out.println("The Sum of odd Natural Number upto " + terms + " terms : " + sum);
    }
}
