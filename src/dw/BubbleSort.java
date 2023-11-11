package dw;

public class BubbleSort {
    public static void sort(int[] arr) {
        //[3, 1, 5, 6, 4, 2, 7, 9, 8]
        int end = arr.length;
        while (end > 0) {
            int i = 1;
            while (i < end) {
                if (arr[i] < arr[i - 1]) {
                    arr[i] = arr[i] + arr[i - 1];
                    arr[i - 1] = arr[i] - arr[i - 1];
                    arr[i] = arr[i] - arr[i - 1];
                }
                i++;
            }
            end--;
        }
    }
}
