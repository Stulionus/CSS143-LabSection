package Labs.Lab6;

public class Combinations {
    public static void main(String[] args) {
        int solution = choose(4, 3);
        System.out.println(solution);

        solution = choose(5, 2 );
        System.out.println(solution);

        solution = choose(3, 3);
        System.out.println(solution);
    }


    public static int choose(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return recursiveFactorial(n) / (recursiveFactorial(r) * recursiveFactorial(n - r));
        }
    }


    public static int recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }
}


