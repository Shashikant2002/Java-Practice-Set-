package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 6, 8, 2, 1, 3 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (j < arr.length && arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        for (int i : arr) {
            System.out.print(i + "    ");
        }
    }
}
