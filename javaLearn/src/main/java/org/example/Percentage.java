package org.example;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks sunjectb 1 : ");
        byte sub1=sc.nextByte();
        System.out.print("Enter marks sunjectb 2 : ");
        byte sub2=sc.nextByte();
        System.out.print("Enter marks sunjectb 3 : ");
        byte sub3=sc.nextByte();
        System.out.print("Enter marks sunjectb 4 : ");
        byte sub4=sc.nextByte();
        System.out.print("Enter marks sunjectb 5 : ");
        byte sub5=sc.nextByte();
        float per= ((sub1+sub2+sub3+sub4+sub5)*100)/500f;
        System.out.print("Your percentage is : " + per + "%");
    }
}
