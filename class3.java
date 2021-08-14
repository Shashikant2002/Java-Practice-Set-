class callphone{
public void Ringing(){
    System.out.println("Ringing......................");
}
public void vibrating(){
    System.out.println("Vibrating.......................");
}
public void calling(){
    System.out.println("Calling.....................");
}
}

public class class3 {
    public static void main(String[] args) {
        callphone vivo = new callphone();
        vivo.calling();
        vivo.vibrating();
        vivo.Ringing();
    }
    
}
