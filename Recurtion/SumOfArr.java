class SumOfArr {

    static int sum(int[] arr, int length) {

        if (length <= 0) {
            return 0;
        }

        return (sum(arr, length - 1) + arr[length - 1]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        int result = sum(arr, arr.length);

        System.out.println("result =>>>>> " + result);

    }
}