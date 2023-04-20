package Labs.Lab3;

public class Math2 {
    public static final double PI = 3.141592653589793;

    public static final double E = 2.718281828459045;

    public static int max(int a, int b){
        if (a== b)return a;
        if (a > b){
            return a;
        }else return b;
    }

    public static double max(double a, double b){
        if (a == b) return a;
        if (a> b){
            return a;
        }else return b;
    }

    public static int pow(int base, int exponent){
        int result = base;
        for(int i = 1; i < exponent; i++){
            result= result * base;
        }
        return result;
    }
}
