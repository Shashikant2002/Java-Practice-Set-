class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("I am a : " + this.getName());
        }
    }
}


public class cwh_74 {
    public static void main(String[] args) {
        mythr1 t = new mythr1("Shashikant on t");
        mythr1 t2 = new mythr1("Shashikant on t2");
        mythr1 t3 = new mythr1("Shashikant on t3");
        mythr1 t4 = new mythr1("Most Important Shashikant");

        t4.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t.start();
        t2.start();
        t3.start();
        t4.start();
        
    }    
}
