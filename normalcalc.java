import java.util.Scanner;
public class normalcalc {
    static int sum(int x,int y){
        int z=0;
        z=x+y;
        return z;
    }
    static int sub(int x,int y){
        int z=0;
        z=x-y;
        return z;
    }
    static int mul(int x,int y){
        int z=0;
        z=x*y;
        return z;
    }
    static int dev(int x,int y){
        int z=0;
        z=x/y;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Operator ()+,-,*,/,");
        String ch =sc.next();
        switch(ch){
            case "+":{
                System.out.println("Enter First Number for Sum: ");
                int x=sc.nextInt();
                System.out.println("Enter Second Number for Sum: ");
                int y=sc.nextInt();
                int z = sum(x, y);
                System.out.println(z);
            }
            case"-":{
                System.out.println("Enter First Number for Subtruction: ");
                int x=sc.nextInt();
                System.out.println("Enter Second Number for Subtruction: ");
                int y=sc.nextInt();
                int z = sub(x, y);
                System.out.println(z);
            }
            case"*":{
                System.out.println("Enter First Number for Multiplaction: ");
                int x=sc.nextInt();
                System.out.println("Enter Second Number for Multiplaction: ");
                int y=sc.nextInt();
                int z = mul(x, y);
                System.out.println(z);
            }
            case"/":{
                System.out.println("Enter First Number for Devision: ");
                int x=sc.nextInt();
                System.out.println("Enter Second Number for Devision: ");
                int y=sc.nextInt();
                int z = dev(x, y);
                System.out.println(z);
            }
        }

    }
    
}
