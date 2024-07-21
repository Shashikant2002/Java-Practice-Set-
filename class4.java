class square{
    int side;
    public int area(){
        return side*side;
    }
    public int pare(){
        return 4*side;
    }
}

public class class4 {
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 9;
        System.out.println(sq.area());
        System.out.println(sq.pare());
    }
    
}
