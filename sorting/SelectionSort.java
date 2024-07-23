package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 100, 5, 6, 8, 2, 1, 3 };
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for (int i : arr) {
            System.out.print(i + "    ");
        }
    }
}
