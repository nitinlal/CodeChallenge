package src.main.java.test;

/**
 * Created by nitin on 9/13/15.
 */
public class PrePostFix {
    private static Integer a;
    private static int b = 1;

    public static void main(String args[]) {
        if (a == null) {
            System.out.println("yep");
            System.out.println("value of b" + b);

            System.out.println("prefix " + (++b));
            System.out.println("postfix " + (b++));

            if (b == 2) {
                System.out.println("so b is  2");
            } else if (b == 3) {
                System.out.println("so b is 3");
            }
        }

    }
}
