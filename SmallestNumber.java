package com.mycompany.determinesanumber;


public class DeterminesANumber {

    public static void main(String[] args) {
        
        double a=15;
        double b=10;
        double c=8;
        
        if(a<b && a<c)
             System.out.println("a is the smallest number");
        else if(b<a && b<c)
             System.out.println("b is the smallest number");
        else
             System.out.println("c is the smallest number");
        
    }
}
