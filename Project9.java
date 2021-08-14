import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Total Marks of Science");
        float s1 = sc.nextFloat();
        System.out.println("Enter a Total Marks of Maths");
        float s2 = sc.nextFloat();
        System.out.println("Enter a Total Marks of Hindi");
        float s3 = sc.nextFloat();
        System.out.println("Enter a Total Marks of English");
        float s4 = sc.nextFloat();
        System.out.println("Enter a Total Marks of Socal-Science");
        float s5 = sc.nextFloat();

        float percentage = (s1+s2+s3+s4+s5)/50;
        System.out.println("Your Cgpa is: ");
        System.out.println(percentage);

    }
}
