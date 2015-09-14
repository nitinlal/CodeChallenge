package src.main.java.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitin on 9/13/15.
 */
public class QuickSort {
    private static Integer pivot;
    private static List<Integer> numbers = new ArrayList<Integer>();
    private static List<Integer> numbersListLeft = new ArrayList<Integer>();
    private static List<Integer> numbersListRight = new ArrayList<Integer>();
    private static List<Integer> numbersSorter = new ArrayList<Integer>();
    private static List<Integer> numbersSorterPivoted = new ArrayList<Integer>();

    static {
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
    }

    private static List<Integer> numbersorter = new ArrayList<Integer>();

    public static void main(String args[]) {

        for (int i = 0; i < numbers.size(); i++) {
            findPivot();
            //reset the list back
            numbersorter.clear();
            numbersListLeft.clear();
            numbersListRight.clear();
            numbersSorterPivoted.clear();
        }

        System.out.println("sorted data" + numbersSorterPivoted);

    }


    private static synchronized void findPivot() {
        pivot = numbers.get((numbers.size() / 2));
        SortUsingPivot();
    }


    private static synchronized void SortUsingPivot() {

        for (int num : numbers) {
            if (num < pivot) {
                numbersListLeft.add(num);
            } else if (num > pivot) {
                numbersListRight.add(num);
            }

            //updated list
            numbersorter.addAll(numbersListLeft);
            numbersorter.add(pivot);
            numbersorter.addAll(numbersListLeft);
        }
    }

    private static synchronized void replacePivotWithLastElement() {
        for (int n : numbersSorter) {

            if (n != pivot) {
                numbersSorterPivoted.add(n);

            }
            numbersSorterPivoted.add(pivot); //add to the end
        }
    }
}
