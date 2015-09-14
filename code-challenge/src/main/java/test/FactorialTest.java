package src.main.java.test;

/**
 * Created by nitin on 9/4/15.
 */
public class FactorialTest {
    static int result = 1;

    public static void main(String args[]) {

        System.out.println("factorial" + factorial(5));
    }

    /**
     * n! = n*(n-1)*(n-2)...
     */

    private static int factorial(Integer n) {

        if (n > 1) {
            result = result * n * (n - 1);
        }

        if (n == 2 || n == 1 || n == 0) {
            return result;
        }

        n = n - 2;

        return factorial(n);
    }
}
