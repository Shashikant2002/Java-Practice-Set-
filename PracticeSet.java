class good extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
        System.out.println("Good Morning");
        }
    }
}
class welcome extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            try{
                Thread.sleep(50);
            }
            catch(Exception e){
                System.out.println(e);
            }
        System.out.println("Welcome Hi I am Shashikant: ");
        }
    }
}


public class PracticeSet {
    public static void main(String[] args) {
        good g = new good();
        g.setPriority(10);
        welcome w = new welcome();
        w.setPriority(6);

        System.out.println(g.getPriority());
        System.out.println(w.getPriority());

        System.out.println(g.getState());
        System.out.println(w.getState());
        System.out.println(Thread.currentThread().getState());



        g.start();
        w.start();
        
    }
    
}
