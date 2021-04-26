package com.company;

import java.util.ArrayList;

public class Paints {
    private ArrayList<Triangle>  triangles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Circle>    circles;

    public Paints() {
        triangles  = new ArrayList<Triangle>();
        rectangles = new ArrayList<Rectangle>();
        circles    = new ArrayList<Circle>();
    }

    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    public void addCircle(Circle circle){
        circles.add(circle);
    }

    public void drawAll(){
        for (Triangle triangle : triangles)
            triangle.draw();
        for (Rectangle rectangle : rectangles)
            rectangle.draw();
        for (Circle circle : circles)
            circle.draw();
    }

    public void printAll(){
        for (Triangle triangle : triangles)
            System.out.println(triangle.toString());
        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle.toString());;
        for (Circle circle : circles)
            System.out.println(circle.toString());;
    }
}
