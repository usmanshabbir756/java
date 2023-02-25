package org.example;

class Employee{
    String name;
    public Employee(){
        name="ali";
    }
    public Employee(String n){
        name=n;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Employee usman=new Employee();
        Employee umar=new Employee("umar");
        usman.setName("usman");
        System.out.println(usman.getName());
        System.out.println(umar.getName());
    }
}
