
package com.mycompany.thepermutationvault;

public class ThePermutationVault {

    public static void main(String[] args) {
      
        int key = 5;
        long fact = 1;

        for (int i = 1; i <= key; i++) {
            fact *= i;
        }

        System.out.println("The museum vault key " + key + " unlocks in " + fact + " ways.");
    }
}
