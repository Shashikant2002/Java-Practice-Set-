import java.util.Scanner;

public class Project19 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=1;
        do{
            System.out.println(b);
            b++;
        }while(b<=a);
    }
}
