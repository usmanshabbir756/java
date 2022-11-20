package org.example;

public class increment {
    public static void main(String[] args) {
        //increment
        // ++x first add then save x++ first save then add
        int x=9;
        int y=x++;
        System.out.println(x);
        System.out.println(y);
        y=++x;
        System.out.println(x);
        System.out.println(y);
    }
}
