class circle1{
    public int radius;

    circle1(int r){
        this.radius = r;
    }

    public double area(){
        return this.radius*this.radius;
    }
}
class cylinder extends circle1{
    cylinder(int r,int h){
        // super(r);
        System.out.println("This is cilinder : ");
        this.height = h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class circle {
    public static void main(String[] args) {
        cylinder obj = new cylinder(12,2);
        // circle1 obj = new circle1(12);
        System.out.println(obj);

    }
    
}
