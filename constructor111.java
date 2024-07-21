class base1{
    base1(){
        System.out.println("I am a Constructor");

    }
    base1(int x){
        System.out.println("i am an overloaded constructor with value of x as : " + x);
    }
}

class derived1 extends base1{
    derived1(){
        super(55);
        System.out.println("I am a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I am an overload constructor of derived wiht value fo y "+ y);
    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println("I am a child of derived constructor ");
    }
    childofderived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a an overloaded constructor of derived with value of z as : " + z);
    }
}

public class constructor111{
public static void main(String[] args) {
    childofderived cd = new childofderived(12,1,2);
}
}