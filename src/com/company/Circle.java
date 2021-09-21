package com.company;
import java.lang.*;
public class Circle extends  Shape {
    protected double radius;
    protected Point center;//добавляем новую переменную, отвечающую за координаты центра круга

    public Circle(double radius, Point center){
        this.center=center;
        this.radius=radius;
    }
    public Circle(double radius, Point center, String color, boolean filled){
        this.center=center;
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", center=" + center +
                '}';
    }//alt+insert->toString()

    @Override
    double getArea() {
        return (Math.PI*radius*radius);
    }//ctrl+o

    @Override
    double getPerimeter() {
        return (2*Math.PI*radius);
    }
}