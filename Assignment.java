
package com.mycompany.assignment;

public class Assignment {

    public static void main(String[] args) {
        
        int x = 5, z = 3;
        int y = x++ - --z * --z;
        
        for (int i = 1; i <= 3; i++) 
        {
            x = (x++ > y) ? (x - y) : (++y - i);
            System.out.print(x + " " + y + " | ");
        }
        
        System.out.println("\nFinal values: x = " + x + ", y = " + y);
    }
}
