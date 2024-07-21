class  cylinder2{
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
    public double surf(){
        return 2 * Math.PI* radius * radius + 2*Math.PI*radius *height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
    
}

public class nmw3 {
    public static void main(String[] args) {
       cylinder2 mycylinder = new cylinder2();
       mycylinder.setheight(12);
        System.out.println(mycylinder.getheight());

        mycylinder.setradius(9);
        System.out.println(mycylinder.getradius());

       System.out.println(mycylinder.surf());
       System.out.println(mycylinder.volume());
    }
}
