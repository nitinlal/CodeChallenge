package test;

import java.util.Scanner;

/**
 * Created by nitin on 9/3/15.
 * simple input which takes in a AP and finds the missing number
 */
public class ArithmeticProgression {

    public static void main(String args[]) {

        System.out.println("Enter the number of Integers you want to enter");
        Scanner in = new Scanner(System.in);

        Integer[] inputNumbers = new Integer[in.nextInt()];

        System.out.println("Array initialized with size " + inputNumbers.length);
        System.out.println("Enter the numbers");

        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.println("one more");
            inputNumbers[i] = in.nextInt(); //next int stored inside the array
        }

        System.out.println("All integers accepted array output:" + inputNumbers);
        System.out.println("Ap = a + 2d, d = " + (inputNumbers[1] - inputNumbers[0]));


        int a = inputNumbers[0];
        int d = (inputNumbers[1] - inputNumbers[0]);

        for (int i = 1; i < inputNumbers.length; i++) {

            int nextNum = a + (i * d);
            if (nextNum != inputNumbers[i]) {
                System.out.println("Missing number :" + nextNum);
                break;
            }

        }

    }
}
