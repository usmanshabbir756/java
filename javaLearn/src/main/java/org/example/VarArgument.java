package org.example;

public class VarArgument {
    static int sum(int x,int ...a){
        int result=x;
        for(int e: a){
            result+=e;
        }
        return result;
    }
    public static void main(String[] args) {
        //error int x must
//        System.out.println(sum());
        System.out.println(sum(1,21));
        System.out.println(sum(1));
        System.out.println(sum(1,21,3));
        System.out.println(sum(1,21,5,4));
    }
}
