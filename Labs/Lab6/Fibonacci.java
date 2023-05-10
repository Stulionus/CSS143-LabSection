package Labs.Lab6;

public class Fibonacci {
    public static void main(String[] args) {
        int[] result = {1,2,3,4,5,6,7};

        for (int i = 0; i < result.length; i++) {
            System.out.println(fibonacci(result[i]));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
