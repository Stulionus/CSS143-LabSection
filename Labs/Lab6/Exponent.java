package Labs.Lab6;

public class Exponent {
    public static void main(String[] args) {
        int result = exponent1(2,2);
        System.out.println(result);
        int result2 = exponent1(2,3);
        System.out.println(result2);


        int result3 = exponent1(2,2);
        System.out.println(result3);
        int result4 = exponent1(2,3);
        System.out.println(result4);
    }

    public static int exponent1(int n,int x){
        if(n == 0){
            return 1;
        }else {return x * exponent1(n-1,x);}
    }

    public static int exponent2(int n,int x){
        if(n == 0){
            return 1;
        }else if(n % 2 == 0){
            return (int) Math.pow(2, exponent2(n/2,x));
        }else {
            return x * (int) Math.pow(2, exponent2((n-1)/2,x));
        }
    }

}
