package com.rcs.classwork.Day17;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Circle.defaultColor);

/*        Circle[] circleArray = new Circle[3];
        circleArray[0] = new Circle(3.34, "Red");;
        circleArray[1] = new Circle(2.0);;
        circleArray[2] = new Circle(5.23, "Blue");*/

        List<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle(3.34, "Red"));
        circleList.add(new Circle(2.0));
        circleList.add(new Circle(5.23, "Blue"));

        for(Circle circle : circleList) {
            System.out.print(circle);
        }

/*        System.out.print(redCircle);
        System.out.print(blackCircle);
        System.out.print(blueCircle);*/
    }
}
