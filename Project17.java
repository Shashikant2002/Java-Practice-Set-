import java.util.Scanner;

public class Project17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Website Checking");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an Organizational Website");
        }
        if(website.endsWith(".com")){
            System.out.println("This is an Commercial Website");
        }
        if(website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
    }
}
