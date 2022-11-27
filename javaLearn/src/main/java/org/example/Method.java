package org.example;
import java.util.Scanner;
public class Method {
    static int rectangleArea(int a,int b){
        if(a>b){
            return a*b;
        }
        else {
            return ((a*2)+(b*2));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int l=sc.nextInt();
        System.out.println("Enter width of rectangle : ");
        int w=sc.nextInt();
        int r=rectangleArea(l,w);
        System.out.println(r);
    }
}
