import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a Number: ");
        int b = sc.nextInt();

        int x = a+b;
        int x1 = a-b;
        int x2 = a*b;
        int x3 = a/b;
        System.out.println("The sum of a+b: "+x);
        System.out.println("The sub of a-b: "+x1);
        System.out.println("The mul of a*b: "+x2);
        System.out.println("The dev of a/b: "+x3);

        sc.close();
    }
}
