package org.example;

class Base1{
    Base1(){
        System.out.println("I am base");
    }
    Base1(int a){
        System.out.println("I am a " + a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am Derived");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("i am b "+ b);
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        Derived1 my=new Derived1(12,13);
    }
}
