public class FirstNaturalNum {
    static void printNumber(int num, int numSum) {
        if (num < 0) {
            System.out.println("Sum of the Natural Number =======>>>>>>>>>>>>>>>> " + numSum);
            return;
        }

        numSum = numSum + num;
        printNumber(num - 1, numSum);
    }

    public static void main(String[] args) {

        printNumber(100, 0);

    }
}
