package Labs.Lab5;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    private int radius;
    private final double PI = 3.14;

    private final int RADIUS = 20;

    private final int DENSITY = 10;

    public Circle(int a, int b, int radius) {
        super(a, b);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public void draw(Graphics g) {
        g.drawOval(super.getX(),super.getY(),radius,radius);
    }
}