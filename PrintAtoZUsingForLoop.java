
package com.mycompany.printatozusingforloop;

public class PrintAtoZUsingForLoop {

    public static void main(String[] args) {
        
        char i;
        
        for(i='A'; i<='Z'; i++)
        {
            System.out.println(" " +i);
            
            if(i=='T')
            {
                break;
            }
        }
    }
}
