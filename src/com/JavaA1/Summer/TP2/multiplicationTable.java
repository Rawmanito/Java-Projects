package com.JavaA1.Summer.TP2;
/*
 * 3.2.3 Tables de Multiplications.
 */

import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of your table, it has to be an integer: ");

        boolean state = true;

        int size = 0;
        while (state) {
            try {
                size = scan.nextInt();
                state = false;
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        }
        tableMultiplication(size);
    }

    /**
     * function that display the multiplication table depending on the size the user wants
     * @param size of the multiplication table
     */
    public static void tableMultiplication(int size){
        for (int i = 1; i <= size; i++) {       //Row
            for (int j = 1; j <= size; j++) {       //Columns
                System.out.print(i * j+"    ");
            }
            System.out.println();//Used to print something at the end of each line to actually make the loop do a \n at the end of eachline (with the soutprint)
        }//Otherwise it wont print line per line
    }
}

