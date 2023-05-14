package Labs.Lab6;

public class Factorial {
    public static void main(String[] args) {
        int solution  = recursiveFactorial(4);
        System.out.println("= " + solution);

        solution  = recursiveFactorial(5);
        System.out.println("= " + solution);

        solution  = recursiveFactorial(3);
        System.out.println("= " + solution);
    }

    public static int recursiveFactorial(int n){
        System.out.print(n + " ");
        if(n == 1){
            return 1;
        }else {return n * recursiveFactorial(n-1);}
    }

}
