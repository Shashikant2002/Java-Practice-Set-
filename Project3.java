import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, sum;
        System.out.println("Enter Number 1: ");
        a = sc.nextInt();
        System.out.println("Enter Number 2: ");
        b = sc.nextInt();
        System.out.println("Enter Number 3: ");
        c = sc.nextInt();
        sum = a + b + c;

        System.out.println(sum);

    }
}
