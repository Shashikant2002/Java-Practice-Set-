import java.util.Scanner;

public class Project8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Total Marks of One Subject");
        int total = sc.nextInt();

        System.out.println("Enter a Total Marks of Science");
        int s1 = sc.nextInt();
        System.out.println("Enter a Total Marks of Maths");
        int s2 = sc.nextInt();
        System.out.println("Enter a Total Marks of Hindi");
        int s3 = sc.nextInt();
        System.out.println("Enter a Total Marks of English");
        int s4 = sc.nextInt();
        System.out.println("Enter a Total Marks of Socal-Science");
        int s5 = sc.nextInt();

        int percentage = (s1+s2+s3+s4+s5)/ ((total * 5)/100);
        System.out.println("Your Percentage is: ");
        System.out.println(percentage);

    }
}
