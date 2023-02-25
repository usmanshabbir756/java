package org.example;

class Employee{
    String name;
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
        usman.setName("usman");
        System.out.println(usman.getName());
    }
}
