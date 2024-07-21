class myThreadrunnable1 implements Runnable{
    public void run(){
        for(int i = 0; i<15;i++){
        System.out.println("I AM a Thread1.............................");
    }
}
}
class myThreadrunnable2 implements Runnable{
    public void run(){
        for(int i = 0; i<15;i++){
        System.out.println("I AM a Thread2...............");
    }
} 
}

public class runnable {
    public static void main(String[] args) {
        myThreadrunnable1 m1 = new myThreadrunnable1();
        Thread t1 =  new Thread(m1);
        myThreadrunnable2 m2 = new myThreadrunnable2();
        Thread t2 =  new Thread(m2);


        t1.start();
        t2.start();
        
    }
    
}
