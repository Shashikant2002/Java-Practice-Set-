class tomy{
    public void hit(){
        System.out.println("Hitting..................");
    }
    public void run(){
        System.out.println("Running...............");
    }
    public void fire() {
        System.out.println("Fireing..................");
    }
}

public class class6 {
    public static void main(String[] args) {
        tomy pl = new tomy();
        pl.fire();
        pl.run();
        pl.hit();
    }
}
