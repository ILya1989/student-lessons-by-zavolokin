package ru.src.main.java;

import java.awt.*;

/**
 * Created by ISS on 24.01.2017.
 */
public class DistansTo {
    public static void main(String args[]) {

        Point pointA = new Point(-1,3);
        Point pointB = new Point(6,2);


        System.out.println("Расстояние равно "+pointA.distance(pointB) ) ;
    }





    public static double distance(Point pointA, Point pointB){



        double AC = Math.pow (pointA.coordinateX - pointB.coordinateX, 2);
        double BC = Math.pow(pointA.coordinateY - pointB.coordinateY, 2);
        return Math.sqrt(AC + BC);
    }



}
