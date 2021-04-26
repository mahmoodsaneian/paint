package com.company;

import java.util.Objects;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double calculutePerimeter(){
        return (double) 2 * Math.PI * radius;
    }

    public double calculuteArea(){
        return (double) Math.PI * (radius * radius);
    }

    public void draw(){
        System.out.println("Circle" + "\n" +
                            "Area = " +calculuteArea()+ "\n"+
                            "Perimeter = " + calculutePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Circle))
            return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
