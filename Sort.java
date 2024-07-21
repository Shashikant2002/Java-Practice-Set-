class Sort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 10, 12, 8, 9 };
        int[] newArr = {};

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println(newArr[1]);
    }
}