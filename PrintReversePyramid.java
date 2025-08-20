
package com.mycompany.printreversepyramid;

public class PrintReversePyramid {

    public static void main(String[] args) {
        
        int num=5;
        int i;
        int j;
        
        for(i=num; i>=1; i--)
        {
            for(j=i; j>=1; j--)
            {
                System.out.print(" "+j);
            }
        
            System.out.println();
        }
        
    }
}
