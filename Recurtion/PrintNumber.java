public class PrintNumber {
    static void printNumber(int num, int sum) {
        if (num <= 0) {
            // sum += i;
            System.out.println("Sum =========>>>>> " + sum);
            return;
        }

        sum += num;
        // System.out.println(sum);

        printNumber(num - 1, sum);
    }

    public static void main(String[] args) {

        printNumber(5, 0);

    }
}

