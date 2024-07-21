// class cylinder4{
//     private int radius;
//     private int height;
    

    // public int getradius(){
    //     return radius;
    // }
    // public void setradius(int r){
    //     this.radius = r;
    // }
    // public int getheight(){
    //     return height;
    // }
    // public void setheight(int h){
    //     this.height = h;
    // }
// }
class rect{
    private int length;
    private int breadth;
    public rect(){
        this.length = 4;
        this.breadth = 5;
    }
    public rect(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getlength(){
        return length;
    }    
    public int getbreadth(){
        return breadth;
    }    
    
}
public class pro5{
    public static void main(String[] args) {
        rect r = new rect(12,56);
        System.out.println(r.getbreadth());
        System.out.println(r.getlength());
    //    cylinder4 mycylinder = new cylinder4();
//        mycylinder.setheight(12);
//         System.out.println(mycylinder.getheight());

//         mycylinder.setradius(9);
//         System.out.println(mycylinder.getradius());
//     }
    }}
