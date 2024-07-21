import java.util.Scanner;
import java.util.Random;

public class Project14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number\n 0 : Rock\n 1 : Paper\n 2 : Scissor");
        int input = sc.nextInt();

        Random rn = new Random();
        int ci = rn.nextInt(3);

        if(input == ci){
            System.out.println("Game is Draw");
        }
        else if(input == 0 && ci == 2 || input == 1 && ci == 0 || input == 2 && ci ==1){
            System.out.println("You Are Win");
        }
        else{
            System.out.println("Computer Win");
        }
        if (ci == 0) {
            System.out.println("Computer choice is: Rock");
        }
        else if (ci == 1) {
            System.out.println("Computer choice is: Paper");
        }
        else if (ci == 2) {
            System.out.println("Computer choice is: Scissor");
        }
    }
}
