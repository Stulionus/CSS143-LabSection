package Labs.Lab3;

public class LineSegment {
    private final int ORIGIN = 0;
    Point2D start = new Point2D(ORIGIN,ORIGIN);;
    Point2D end = new Point2D(ORIGIN,ORIGIN);;

    public LineSegment(){
        start = new Point2D(ORIGIN,ORIGIN);
        end = new Point2D(ORIGIN,ORIGIN);
    }

    public LineSegment(Point2D start, Point2D end){
        setStartPoint(start);
        setEndPoint(end);
    }

    public LineSegment(LineSegment other){
        setStartPoint(other.start);
        setEndPoint(other.end);
    }

    public String getStart() {
        return start.getX() + "," +  start.getY();
    }

    public void setStartPoint(Point2D other){
        start.setX(other.getX());
        start.setY(other.getY());
    }

    public void setEndPoint(Point2D other){
        end.setX(other.getX());
        end.setY(other.getY());
    }

    public String getEnd() {
        return end.getX() + "," +  end.getY();
    }

    @Override
    public String toString(){
        return "Line start(" + getStart() + ") and end(" + getEnd() + ")";
    }

    public boolean equals(Object other){
        if (other == null ||!(other instanceof LineSegment)){return false;}
        LineSegment that = (LineSegment) other;
        if (this.start.equals(that.start) && this.end.equals(that.end)){return true;}
        return false;
    }

    public double distance(){
        double dist;
        int deltaX = Math.abs(start.getX() - end.getX());
        int deltaY = Math.abs(start.getY() - end.getY());
        dist = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
        return dist;
    }

}
