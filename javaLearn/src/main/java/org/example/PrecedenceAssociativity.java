package org.example;

public class PrecedenceAssociativity {
    public static void main(String[] args) {
        //precedence
        //  (*,/) high  (+,-) low
        int x=6*4-32;
        /*
        x=24-32
        x=-8
         */
        System.out.println(x);
        //Associativity
        //  (*,/) high(left to right)  (+,-) low (left to right) (++,=) right to left
        int y=6/2-3*2;
        /*
        x=3-3*2
        x=3-6
        x=-3
         */
        System.out.println(y);
    }
}
