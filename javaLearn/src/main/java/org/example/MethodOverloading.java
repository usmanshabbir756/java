package org.example;
import java.util.Scanner;
public class MethodOverloading {
    private static int c;

    static void mobile(){
        System.out.println("Mobile");
    }
    static void mobile(int a){
        System.out.println("Mobile : " + a);
    }
    static void mobile(int c,String b){
        System.out.println("Mobile  price range : " + c + " Category : "+ b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter range : ");
        int x=sc.nextInt();
        System.out.print("enter Category : ");
        String y=sc.next();
        mobile();
        mobile(x);
        mobile(x,y);
    }
}
