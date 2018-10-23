package com.company;
class Circle{
    private double radius =1 ;
    private String color ="green";
    public Circle(){}
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public double getPerimeter(){
        return Math.PI*radius*radius;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "A Circle with radius = "+getRadius()+" and color = "+getColor();
    }
}

class Cylinder extends Circle{
    private double height =1 ;
    public Cylinder(){}
    public Cylinder(double height){
        this.height = height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }
    @Override
    public String toString(){
        return "A Cylinder with radius = "+getRadius()+" and color = "+getColor()+" and height = "+getHeight()+", which is subclass of"+super.toString();
    }
}
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.3, "purple");
        System.out.println(circle);

	    Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.4);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.4,2.5,"red");
        System.out.println(cylinder);


    }
}
