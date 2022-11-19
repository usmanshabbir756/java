package org.example;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First name ");
        String fName=input.next();
        System.out.println("Enter Last name ");
        String lName=input.next();
        System.out.println("Hello "+ fName + lName);


    }
}
