package src.main.java.test;

/**
 * Created by nitin on 9/14/15.
 */
public class SortBubble {
    /*
       Simple bubble sort implementation
       using an array
     */
    public static void main(String args[]) {

        Integer[] arr = {2, 5, 1, 8, 3, 0, 3, 1, 9, 23, 2, 9, 3};
        arr = bubbleSortify(arr);
        for (Integer num : arr) {
            System.out.println(" " + num);
        }
    }

    /**
     * @param arr array to be sorted
     * @return sorted array
     */
    private static Integer[] bubbleSortify(Integer[] arr) {
        boolean loop = true;
        while (loop) {
            boolean circle = false;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;  //swap
                    circle = true;
                }
            }
            loop = circle;
        }
        return arr;

    }
}
