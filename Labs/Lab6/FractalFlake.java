package Labs.Lab6;

import java.awt.*;

public class FractalFlake extends Shape {
    private final int limit;
    private final int numBranches;

    public FractalFlake( int limit, int numBranches , int x, int y) {
        super(x,y);

        this.limit = limit;
        this.numBranches = numBranches;
    }

    @Override
    public void draw(Graphics g) {   //a redirect or facade
        draw(g, getX(), getY(), limit);
    }

    private void draw(Graphics g, int startX, int startY, int limit){
        if (limit >= 3){
            for (int i = 0; i < numBranches; i++) {
                int x2 = startX + (int) (limit * Math.cos((2*Math.PI / numBranches) * i));
                int y2 = startY - (int) (limit * Math.sin((2*Math.PI / numBranches) * i));
                g.drawLine(startX,startY,x2,y2);
                draw(g,x2,y2,limit/3);
            }
        }
    }

}

