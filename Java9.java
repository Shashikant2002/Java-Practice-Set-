public class Java9 {
    static void whileloop(){
        int i = 1;
        System.out.println(i);
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }

    static void dowhile(){
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b<=5);
        
    }
    static void forloop(){
        int c = 5;
        for(int i=0; i<=c;i++){
            System.out.println(i);
        }
    }
public static void main(String[] args) {
    System.out.println("By While Loop");
    whileloop();//By While Loop
    System.out.println("By Do-While Loop");
    dowhile();//By Do While Loop
    System.out.println("By For Loop");
    forloop();//By For Loop

}
    }

