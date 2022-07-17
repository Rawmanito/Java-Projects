package com.JavaA1.Summer.TP2;
import java.util.*;
//1. Créez une fonction parite() ;
//2. Complétez cette fonction pour demander à l’utilisateur de saisir un entier ;
//3. Si cet entier est pair, affichez un message indiquant que ce chiffre est pair, tout en rappelant
//sa valeur ;
//4. Si cet entier est impair, affichez un message indiquant que ce chiffre est impair, tout en
//rappelant sa valeur ;
public class Parity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        boolean state = true;
        int input = 0;
        while (state) {
            try {
                input = scan.nextInt();
                state = false;
            } catch (Exception e) {
                System.out.println("'" + input + "' is not an integer. Please enter a valid input:");
                scan.next();
            }
        }
        parity(input);

    }

    public static void parity(int inpute) {
        if (inpute % 2 == 0) {
            System.out.println("Your input '" + inpute + "' is pair.");

        } else {
            System.out.println("Your input '" + inpute + "' is not pair.");
        }
    }
}
