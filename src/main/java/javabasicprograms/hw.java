package javabasicprograms;


import java.util.Scanner;

public class hw {
        public static void main(String[] args) {
            System.out.println("hello world");
            Scanner in=new Scanner(System.in);
            double si;
            double n;
            double r;
            double p;
            System.out.println("Enter P");
            p=in.nextDouble();
            System.out.println("Enter N");
            n=in.nextDouble();
            System.out.println("Enter R");
            r=in.nextDouble();
            si=p*n*r/100;
            formula(si);


        }
        public static void formula(double si)
        {
            System.out.println("SI is "+si);
        }

}
