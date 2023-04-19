package Labs.Lab3;

import java.awt.*;

/* Invariants:
public class Square extends Shape{}
public class Circle extends Shape{}
public class Triangle extends Shape{}
Public clas Hexagon extends Shape{}
 */
public class Shape {
    private int x;
    private int y;
    Color cl = new Color(0,0,0);

    public Shape(){
        x = 0;
        y = 0;
        Color cl = new Color(0,0,0);
    }

    public Shape(int x,int y,Color newColor){
        this.x = x;
        this.y = y;
        cl = newColor;
    }

    public Shape(Shape other){
        this.x  = other.x;
        this.y = other.y;
        this.cl = other.cl;
    }


    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString(){
        return "Shape (" + x + "," + y + ") and color:java.awt.Color[r=" + cl.getRed() + ",g=" + cl.getGreen() + ",b=" + cl.getBlue() + "]and area: " + this.getArea();
    }


    public int getArea(){
        return -1;
    }
}
