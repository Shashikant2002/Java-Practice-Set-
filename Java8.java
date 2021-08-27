import java.util.Scanner;

public class Java8 {
    static void calculation(){
        int i,j,result;
        System.out.println("Sum = 1\nSub = 2\nMul = 3\ndev = 4\n");
         Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
         if(c == 1){
             System.out.println("Enter a number: ");
            i = sc.nextInt();
            System.out.println("Enter a number: ");
            j = sc.nextInt();
            result = i+j;
            System.out.println("The Sum of i + j : "+result);
         }
         else if(c == 2){
            System.out.println("Enter a number: ");
            i = sc.nextInt();
            System.out.println("Enter a number: ");
            j = sc.nextInt();
            result = i-j;
            System.out.println("The Sub of i - j : "+result);
         }
         else if(c == 3){
            System.out.println("Enter a number: ");
            i = sc.nextInt();
            System.out.println("Enter a number: ");
            j = sc.nextInt();
            result = i*j;
            System.out.println("The mul of i * j : "+result);
         }
         else if(c == 4){
            System.out.println("Enter a number: ");
            i = sc.nextInt();
            System.out.println("Enter a number: ");
            j = sc.nextInt();
            result = i/j;
            System.out.println("The Dev of i / j : "+result);
         }
    }

    static void printstar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Print Star: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)  
        {  
            for(int j=1;j<=i;j++)  
            {  
               System.out.print("*");
            }  
           System.out.println(" ");
        }  

    }
    public static void main(String[] args) {
       System.out.println("1. = Calculation\n2. = Print Star");
       System.out.println("Enter a Number: ");
       int a;
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       if(a == 1){
        calculation();
       }
       if(a == 2){
        printstar();
       }
        
    }
    
}
