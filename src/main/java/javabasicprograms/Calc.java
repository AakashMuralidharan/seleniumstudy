package javabasicprograms;

import java.util.Scanner;

public class Calc  {
    public static void main(String[] args) {
        double a;
        double b;
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter val of A");
        a=in.nextDouble();
        System.out.println("Enter val of B");
        b=in.nextDouble();
        System.out.println("Choose the operation: 1. Add 2. Sub 3. Multi 4. Division ");
        n=in.nextInt();
        switch (n){
            case 1:

                add(a,b);
                break;
            case 2:

                sub(a,b);
                break;
            case 3:

                mult(a,b);
                break;
            case 4:

                div(a,b);
                break;
             default:
                 System.out.println("Choose any one from above options");
        }
        }
    public static void add(double a,double b){
        double c;
        System.out.println("You have chose: Addition ");
        c=a+b;
        System.out.println("Addition:"+c);
    }
    public static void sub(double a,double b){
        double c;
        System.out.println("You have chose: Subtraction ");
        c=a-b;
        System.out.println("Subtraction:"+c);
    }
    public static void mult(double a,double b){
        double c;
        System.out.println("You have chose: Multiplication ");
        c=a*b;
        System.out.println("Multiplication:"+c);
    }
    public static void div(double a,double b){
        double c;
        System.out.println("You have chose: Division ");
        c=a/b;
        System.out.println("Division:"+c);
    }

}
