public class method1 {
 int logic(int x, int y){
    int z;
    z=x+y;
    return z;
}
public static void main(String[] args) {

    int b=5;
    int c=5;
    method1 obj = new method1();
   int a = obj.logic(b,c);
   System.out.println(a);
}
    
}
