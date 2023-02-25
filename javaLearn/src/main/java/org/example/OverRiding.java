package org.example;

class A{
    public void method(){
        System.out.println("I am A ");
    }
}
class B extends A{
    @Override
    public void method(){
        System.out.println("I am B");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        B n1=new B();
        n1.method();
    }
}
