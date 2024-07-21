class base{
    int x;
    public void setx(int x){
        System.out.println("Hi I AM Shashikant in base class: ");
        this.x = x;
    }
    public int getx(){
        return x;
    }
}
class drived extends base{
    int y;
    public void sety(int y){
        System.out.println("Hi I AM Shashikant in base Inheritance: ");
        this.y = y;
    }
    public int gety(){
        return y;
    }
}


public class Inheritance1{
    public static void main(String[] args) {
        drived d = new drived();
       d.setx(5);
       d.sety(55);
       System.out.println(d.getx());
       System.out.println(d.gety());
    }
}