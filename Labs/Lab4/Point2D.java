package Labs.Lab4;

public class Point2D {
    private int x;
    private int y;

    public Point2D(){
        x = 0;
        y=0;
    }

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int inputX){
        x = inputX;
    }

    public void setY(int inputY){
        y = inputY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void resetToOrigin(){
        x = 0;
        y = 0;
    }

    public void translate(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }

    @Override
    public String toString(){
        return x + ", " + y;
    }

    public boolean equals(Point2D that){
        if ((that.x == this.x )&&( that.y == this.y )){
            return true;
        } else {return false;}
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); //Question: why don’t I need c.toString() here?
        //Maybe println calls .toString() somewhere inside its code.
        System.out.println("Are b and c equal:" + b.equals(c));
    }
}
