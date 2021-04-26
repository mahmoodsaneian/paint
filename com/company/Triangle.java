package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    private ArrayList<Integer> sides;

    public Triangle(int side1, int side2, int side3) {
        sides = new ArrayList<Integer>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isEquilateral(){
        int side = sides.get(0);
        return (sides.get(1) == side) && (sides.get(2) == side);
    }

    public double calculutePerimeter(){
        return  sides.get(0) +
                sides.get(1) +
                sides.get(2);
    }

    public double calculuteArea(){
        if (isEquilateral()){
            return (double) ((Math.sqrt(3)) / 4) * (sides.get(0) * sides.get(0));
        }else {
            double heigt = (double) Math.sqrt((sides.get(0) * sides.get(0)) - (sides.get(2)) - sides.get(2));
            return (heigt * sides.get(2)) / 2;
        }
    }

    public void draw(){
        System.out.println("Triangle" +"\n"+
                            "Area = " +  calculuteArea() +"\n"+
                            "Perimeter = " +calculutePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Triangle))
            return false;
        Triangle triangle = (Triangle) o;
        return this.sides.get(0).equals(triangle.sides.get(0)) &&
                this.sides.get(1).equals(triangle.sides.get(1)) &&
                this.sides.get(2).equals(triangle.sides.get(2)) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides= " + sides +
                '}';
    }

}
