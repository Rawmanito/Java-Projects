package com.JavaA1.Summer.TP2;
import java.util.*;
import static java.lang.Math.*;


public class TP2Poly {
    public static void main(String[] args) {
        System.out.println("Polynome de la forme P(x) = ax^2+bx+c avec (a,b,c) E R^3, Delta = b^2-4ac");

        Scanner scan = new Scanner(System.in);
        boolean state = true;
        int b = 0;
        int a = 0;
        int c = 0;
        while (state) {
            try {
                System.out.println("Value of a:");
                a = scan.nextInt();
                System.out.println("Value of b");
                b = scan.nextInt();
                System.out.println("Value of c");
                c = scan.nextInt();
                state = false;

            } catch (Exception E) {
                System.out.println("Please enter an integer");
                scan.next();
            }
        }

        double determinant = myDeterminant(a, b, c);
        System.out.println("The determinant is equal to: "+determinant);

        zeroRoot(a, b, determinant);
    }

    /**
     * method that computes the determinant
     * @param a ax^2
     * @param b bx
     * @param c c
     * @return the determinant
     */
    public static double myDeterminant(int a, int b, int c){
        double delta = Math.pow(b, 2)-4*(a*c);
        return delta;

    }

    /**
     * method that computes the root depending on the value of the determinant
     * @param a
     * @param b
     * @param determinant
     */
    public static void zeroRoot(int a, int b, double determinant){
        if(determinant>0){
            double rootOne =  (-b-(Math.sqrt(determinant)))/(2*a);
            double rootTwo = (-b+(Math.sqrt(determinant)))/(2*a);
            System.out.println("As the determinant is positive:\nx1="+rootOne+"\nx2="+rootTwo);
            return;
        }
        else if(determinant==0){
            double alpha = -b/2*a;
            System.out.println("As the determinant is equal to zero:\nx1,2="+alpha);
        }
        else{
            double alpha = -b/2*a;
            double negativePart = Math.sqrt(determinant)/(2*a);
            System.out.println("As the determinant is negative, those will be imaginary roots:\nx1="+alpha+"i+"+abs(negativePart)+"\nx2="+alpha+"i-"+abs(negativePart));
        }
    }
}


