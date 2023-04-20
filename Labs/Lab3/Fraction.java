package Labs.Lab3;

public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int num, int denom){
        numerator = num;
        if (denom == 0){
            System.out.println("Denominator cannot be zero");
            denominator = 1;
        }else {
            denominator = denom;
        }
    }

    public Fraction(Fraction other){
        numerator = other.numerator;
        denominator = other.denominator;
    }

    @Override
    public String toString(){
        return this.numerator + "/" + denominator;
    }

    public Fraction add(Fraction other){
        int newDenominator;
        int newNumerator;
        if(this.denominator == other.denominator){
            newDenominator = this.denominator;
            newNumerator = this.numerator + other.numerator;
        }else if(this.denominator < other.denominator){
            float difference = other.denominator/this.denominator;
            newDenominator = other.denominator;
            newNumerator = (int)(this.numerator * difference + other.numerator);
        }else{
            float difference = this.denominator/other.denominator;
            newNumerator = (int) (other.numerator * difference + this.numerator);
            newDenominator = this.denominator;
        }

        return new Fraction(newNumerator,newDenominator);
    }

    public boolean equals(Fraction other) {
        if( other != null && ! (other instanceof Fraction ) ) return false;
        Fraction that = (Fraction) other;
        if (this.numerator/this.denominator == that.numerator/ that.denominator){
            return true;
        }
        return false;
    }

    public int getNum(){
        return numerator;
    }

    public int getDenom(){
        return denominator;
    }

}