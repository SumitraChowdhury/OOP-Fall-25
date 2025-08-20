
package com.mycompany.printpyramid;

public class PrintPyramid {

    public static void main(String[] args) {
        
        int num=4;
        int i;
        int j;
        
        for(i=1; i<=num; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" "  +j);
            }
        System.out.println();
        }
        
    }
}
