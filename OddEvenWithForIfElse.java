
package com.mycompany.oddevenwithforifelse;

public class OddEvenWithForIfElse {

    public static void main(String[] args) {
        
        int a;
        
        for(a=1; a<=10; a++)
        {
            System.out.println("a= " +a);
            
            if(a%2==0)
            {
                System.out.println("It is even");
            }
            
            else
            {
                System.out.println("It is odd");
            }
        }
       
    }
}
