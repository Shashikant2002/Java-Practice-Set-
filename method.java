public class method {
    static void sum(int x,int y,int z){
       int result = x + y + z;
       System.out.println(result);
        }

    static void sum(int x){
       int result = ++x;
       System.out.println(result);
        
    }

public static void main(String[] args) {
    System.out.println("The result is:--- ");
   sum(4,6,3);
   sum(4);

}
}

