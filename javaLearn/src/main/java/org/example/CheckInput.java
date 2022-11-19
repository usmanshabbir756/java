package org.example;
import java.util.Scanner;
public class CheckInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer :");
//        int num=sc.nextInt();
        boolean i=sc.hasNextInt();
        System.out.println(i);
    }
}
