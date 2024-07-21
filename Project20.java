import java.util.Scanner;

public class Project20 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a; i!=0; i-- ){
            System.out.println(i);
        }
    }
}
