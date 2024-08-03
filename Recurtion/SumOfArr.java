class SumOfArr {

    static int sum(int num) {

        if (num <= 0) {
            return 0;
        }

        return (sum(num));
    }

    public static void main(String[] args) {
        int num = 10;

        int result = sum(num);

        System.out.println("result =>>>>> " + result);

    }
}