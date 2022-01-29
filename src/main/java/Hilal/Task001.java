package main.java.Hilal;

public class Task001 {
   // Write a Java Program to swap two numbers using the third variable.
   public static void main(String[] args) {
       int a = 4;
       int b = 7;

       System.out.println("a = " + a);
       System.out.println("b = " + b);

       int temp = a;
       a = b;
       b = temp;

       System.out.println("a = " + a);
       System.out.println("b = " + b);
   }
}
