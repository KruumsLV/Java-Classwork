package com.rcs.classwork.Day17;

public class Circle {
    // Constant PI
    static final double PI = 3.14159265;
    static final String defaultColor = "Black";

    // Lauki:
    private double radius;
    private String color;

    // 2 konstruktori
    /**
     * Konstruktors ar 1 parametru.
     * Krāsa tiek uzstādīta Circle.defaultColor
     * @param radius Circle radius
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = defaultColor;
    }

    /**
     * Konstruktors ar 2 parametriem.
     * @param radius Rādiuss
     * @param color Krāsa
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public String getColor() {
        return this.color;
    }

    // Metodes
    /**
     * Aprēķina riņķa laukumu
     * @return Riņķa laukuma vērtību
     */
    public double getArea() {
        //return Math.pow(this.radius, 2.0) * PI;
        return this.radius * this.radius * PI * 2;
    }

    /**
     * Aprēķina riņķa līnijas garumu
     * @return Riņķa līnijas garuma vērtību
     */
    public double getCircleLength() {
        return 2 * PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Color = %s, Area = %.2f, Circle Length = %.2f\n",
                            this.color, this.getArea(), this.getCircleLength());
    }
}
