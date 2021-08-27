class base{
    int x;
    public int getx(){
        System.out.println("Hi I am Shashikant in base: ");
        return x;
    }    
    public void setx(int x){
        this.x = x;
    }
}
class drived extends base{
    int y;
    public int gety(){
        System.out.println("Hi I AM Shashikant in base Inheritance: ");// This is not showing 
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}
class basedrive extends base{
    int z;
    public int getz(){
        System.out.println("Hi I AM Shashikant in base Inheritanc: ");
        return z;
    }
    public void setz(int z){
        this.z = z;
    }
}

public class Inherentence {
    public static void main(String[] args) {

        basedrive d = new basedrive();
        // d.sety(5); This is Error
        d.setx(6);
        d.setz(7);
        System.out.println(d.getx());
        // System.out.println(d.gety()); This is Error
        System.out.println(d.getz());
    }
}
