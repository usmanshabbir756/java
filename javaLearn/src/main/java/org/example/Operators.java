package org.example;

public class
Operators {
    public static void main(String[] args) {
        //arithmetic
        // + , - , / ,* , %
        int a=5;
        int b=7+a;
        System.out.println(b);

        //comparison
        // == >= , <= ,< , >
        int num1 = 5;
        int num2 = 9;
        System.out.println(num2>num1);
        //assignment
        // = , += ,-= , *= ,/=
        int num3=9;
        num3+=5;
        System.out.println(num3);
        //logical
        // && , || ,!
        int num4=5;
        int num5=7;
        System.out.println(num4<num5 || num5<num4);
    }
}
