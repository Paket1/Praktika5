package com.company;

public class CircleMovable extends Circle implements Movable{

    public CircleMovable(double radius, Point center) {
        super(radius, center);
    }

    @Override
    public void move(int x, int y) {
        this.center.setX(this.center.getX()+x);
        this.center.setY(this.center.getY()+y);
    }
}
