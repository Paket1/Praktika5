package com.company;

public class CircleMovable extends Circle implements Movable{

    public CircleMovable(double radius, Point center) {
        super(radius, center);
    }

    @Override
    public void move(int x, int y) {
        this.center.setX(center.getX()+x);
        this.center.setY(center.getY()+y);
    }
}
