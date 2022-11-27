package org.example;
import java.util.Scanner;
public class FibonacciSeriesRecursion {
    static int fibonacciSeries(int n){
        if(n<=1){
            return 1;
        }
        else {
            return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number : ");
        int a=sc.nextInt();
        System.out.println(fibonacciSeries(a));
    }
}
