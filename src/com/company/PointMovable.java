package com.company;

public class PointMovable extends Point implements Movable {


    public PointMovable(int x, int y) {
        super(x, y);
    }


    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);//применяем метод на текущий объект класса(this указ. на объект, пока его не создали)
        this.setY(getY()+y);
    }
}
