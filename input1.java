import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int a = sc.nextInt();
        System.out.println("Enter a Float: ");
        float b = sc.nextFloat();
        System.out.println("Enter a Double: ");
        double c = sc.nextDouble();
        char d = 'S';
        boolean e = true;
        System.out.println("Enter a String: ");
        String f = "Hi I AM Shashikant";
        
        sc.close();
        System.out.println("This is a float: "+b);
        System.out.println("This is a integer: "+a);
        System.out.println("This is a double: "+c);
        System.out.println("This is a Character: "+d);
        System.out.println("This is a boolean: "+e);
        System.out.println("This is a String: "+f);
    }
    
}
