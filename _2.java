import java.util.*;

public class _2 {

    static void generateTable(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + (i * x));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table Number: ");
        int num = sc.nextInt();

        generateTable(num);
    }
}