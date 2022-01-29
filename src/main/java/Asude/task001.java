package Asude;

public class task001 {

    /**
     * Write a Java Program to swap two numbers using the third variable.
     */

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a+b;

        b=a;
        a=c-b;

        System.out.println("a= " + a + " b= " + b);


    }
}
