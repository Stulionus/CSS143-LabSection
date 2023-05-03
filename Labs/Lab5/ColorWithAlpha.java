package Labs.Lab5;

import java.util.Objects;

public class ColorWithAlpha extends SimpleColor{
    private int alpha;

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        if (alpha < 0 || alpha > 255) {
            throw new ColorException();
        } else {
            this.alpha = alpha;
        }
    }

    public ColorWithAlpha(int a){
        super.setColor(0,0,0);
        if(a < 0 || a > 255){
            throw new ColorException();
        }
        setAlpha(a);
    }

    public ColorWithAlpha(int r, int g, int b, int a){
        super.setColor(r,g,b);
        setAlpha(a);
    }

    public ColorWithAlpha(ColorWithAlpha obj){
        super.setColor(obj.getR(), obj.getG(), obj.getB());
        setAlpha(obj.getAlpha());
    }


    @Override
    public String toString() {
        return super.toString() + ", alpha:"+ alpha;
    }

    @Override
    public boolean equals(Object o) {
        ColorWithAlpha that = new ColorWithAlpha(0);
        if (this.getR() == that.getR()&& this.getG() == that.getG() && this.getB() == that.getB() && this.getAlpha() == that.getAlpha()){
            return true;
        }
        return false;
    }

}
