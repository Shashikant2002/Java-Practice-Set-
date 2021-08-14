import java.util.Scanner;

public class Project16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Year For Check Leap Year or Not");
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println( year + " is A Leap Year ");
        }
        else{
            System.out.println("Not a Leep Year");
        }
    }
    
}
