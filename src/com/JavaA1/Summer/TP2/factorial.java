package com.JavaA1.Summer.TP2;
import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int input = 0;
        boolean state = true;
        while(state){
            try{
                input = scan.nextInt();
                state = false;
            }
            catch (Exception e){
                System.out.println("Invalid input, please enter a valid one:");
            }
        }
        int result = factoriel(input);
        System.out.println(result);
        System.out.println(factoriel(input));

        }
    public static int factoriel(int input){
        for(int i =1; i<input;i++){
            input *= i;
        }
    return input;
    }

}


