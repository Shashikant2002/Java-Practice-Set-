public class array {
    public static void main(String[] args) {
        int size = 100;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 2;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        

        System.out.println(arr.length);
    }
}
