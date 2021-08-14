class cylinder1{
    private int radius;
    private int height;

    public int getradius(){
        return radius;
    }
    public void setradius(int r){
        this.radius = r;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int h){
        this.height = h;
    }
}

public class new1 {
    public static void main(String[] args) {
       cylinder1 mycylinder = new cylinder1();
       mycylinder.setheight(12);
        System.out.println(mycylinder.getheight());

        mycylinder.setradius(9);
        System.out.println(mycylinder.getradius());
    }
}
