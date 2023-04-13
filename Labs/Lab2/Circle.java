package Labs.Lab2;

public class Circle {
    private int x;
    private int y;

    private int radius;

    private final double pi = 3.14;
    private String consOut = "o";

    public Circle(){
        x = 0;
        y = 0;
        radius = 0;
    }

    public Circle(int xIn, int yIn){
        x = xIn;
        y = yIn;
        radius = 0;
    }


    public Circle(int xIn, int yIn, int lengthIn, int widthIn){
        x = xIn;
        y = yIn;
        radius = widthIn;
    }

    public void draw(){
        System.out.println(consOut);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }


    public double getArea(){
        return Math.pow(radius,2) * pi ;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void setRadius(int widthIn) {
        radius = widthIn;
    }

    @Override
    public String toString(){
        return "o";
    }

    public boolean equals(Circle that){
        if (this.x == that.x && this.y == that.y && this.radius == that.radius){
            return true;
        } else {return false;}
    }
}
