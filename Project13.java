import java.util.Scanner;
public class Project13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;

        System.out.println("Enter your Physics Marks");
        m1 = sc.nextByte();
        System.out.println("Enter your Maths Marks");
        m2 = sc.nextByte();
        System.out.println("Enter your Computer Marks");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You Are Pass");
        }
        else{
            System.out.println("You are Fail You are try again");
        }
    }
}
