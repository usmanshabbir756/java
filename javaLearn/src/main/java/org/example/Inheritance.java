package org.example;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived usman=new Derived();
        usman.setX(123);
        usman.setY(11);
        System.out.println(usman.getX());
        System.out.println(usman.getY());

    }
}
