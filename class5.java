class rect{
    int li,wi;
    public int area(){
        return li*wi;
    }
    public int para(){
        return 2*(li+wi);
    }
}

public class class5 {
    public static void main(String[] args) {
        rect re = new rect();
        re.li = 5;
        re.wi = 5;
        System.out.println(re.area());
        System.out.println(re.para());
    }
    
}
