package Labs.Lab5;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Square extends Shape {
    private int width;
    private int height;

    private final int RADIUS = 20;
    private final int DENSITY = 10;

    public Square(int a, int b, int width, int height) {
        super(a, b);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw(Graphics g) {
        g.draw3DRect(super.getX(),super.getY(),width,height, false);
    }
}
