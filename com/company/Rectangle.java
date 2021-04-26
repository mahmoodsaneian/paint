package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Integer> sides;

    public Rectangle(int side1, int side2, int side3, int side4) {
        sides = new ArrayList<Integer>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    public double calculutePerimeter(){
        return (double) sides.get(0) +
               sides.get(1) +
               sides.get(2) +
               sides.get(3);
    }

    public boolean isSquare(){
        int side = sides.get(0);
        return (sides.get(1) == side) && (sides.get(2) == side) && (sides.get(3) == side);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public double calculuteArea(){
        if (isSquare()){
            return (double) (sides.get(0) * sides.get(0));
        }else{
            return (double) (sides.get(0) * sides.get(1));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Rectangle))
            return false;
        Rectangle rectangle = (Rectangle) o;
        return  this.sides.get(0).equals(rectangle.sides.get(0)) &&
                this.sides.get(1).equals(rectangle.sides.get(1)) &&
                this.sides.get(2).equals(rectangle.sides.get(2)) &&
                this.sides.get(3).equals(rectangle.sides.get(3));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }

    public void draw(){
        System.out.println("rectangle" +"\n" +
                            "area = "  +calculuteArea()+"\n"+
                            "perimeter = "+calculutePerimeter());
    }
}
