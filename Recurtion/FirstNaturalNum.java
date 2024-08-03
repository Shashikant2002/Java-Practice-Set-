public class FirstNaturalNum {
    static void printNumber(int num, int numSum) {
        if (num < 0) {
            return;
        }
        System.out.println(num);

        numSum = numSum + num - 1;

        printNumber(num - 1, numSum);
    }

    public static void main(String[] args) {

        int num = 0;

        printNumber(5, num);

        System.out.println("Sum is =======>>>>>> " + num);

    }
}
