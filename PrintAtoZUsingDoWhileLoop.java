
package com.mycompany.printatozusingdowhileloop;

public class PrintAtoZUsingDoWhileLoop {

    public static void main(String[] args) {
        
        char i='A';
        
        do
        {
            System.out.println(" " +i);
            
            if(i=='T')
            {
                break;
            }
            i++;
        }
        
        while(true);
        
    }
}
