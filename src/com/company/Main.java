package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PointMovable a = new PointMovable(1, 1);
        System.out.println(a.toString());
        a.move(2, 3);
        System.out.println(a.toString());
        Point centr = new Point(0, 0);
        CircleMovable b = new CircleMovable(1,centr);
        System.out.println(b.toString());
        b.move(4,6);
        System.out.println(b.toString());
    }
}
