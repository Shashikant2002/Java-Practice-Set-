class cylinder3{
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
    public cylinder3(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

}

public class new2 {
    public static void main(String[] args) {
       cylinder3 mycylinder = new cylinder3(12,9);
    //    mycylinder.setheight(12);
        System.out.println(mycylinder.getheight());

        // mycylinder.setradius(9);
        System.out.println(mycylinder.getradius());
    }
}
