class MyThread1 extends Thread{
    public void run(){
        while(true){
        System.out.println("Hi I AM Shashikant..............");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while(true){
        System.out.println("Hi I AM Shashikant in Second..............");
        }
    }
}


public class new123{
    public static void main(String[] args){
        MyThread1 d1 = new MyThread1();
        MyThread2 d2 = new MyThread2();

        d1.start();
        d2.start();
    }
}