import java.util.Scanner;

public class Calc {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a First Number");
	int x = sc.nextInt();

    System.out.println(" Enter a Character(+,-,*,/)");
    String  str = sc.next();

	System.out.println("Enter a Second Number");
	int y = sc.nextInt();
    switch(str){
        
        case "+":
            int sum = x+y;
            System.out.println("The Result is : "+sum);
            break;
        case "-":
            int sub = x-y;
            System.out.println("The Result is : "+sub);
            break;
        case "*":
            int mul = x*y;
            System.out.println("The Result is : "+mul);
            break;
			
        case "/":
            int dev = x/y;
            System.out.println("The Result is : "+dev);
            break;

        default:
            System.out.println("Not Match");
            break;
		}
		sc.close();

}
    
}
