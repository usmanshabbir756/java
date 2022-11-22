package org.example;
import java.util.Scanner;
import java.util.Random;
public class RPSGame {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
        System.out.println("Enter value ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        int a=sc.nextInt();
        int b=rand.nextInt(3)+1;
        if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2)){
            System.out.println("You win");
        }
        else if(a==b){
            System.out.println("tie");
        }
        else{
            System.out.println("Lose");
        }
        System.out.println("computer choice : " + b);
    }


}
