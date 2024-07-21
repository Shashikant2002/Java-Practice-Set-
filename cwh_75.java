class mythr1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("I am a : " + this.getName());
        }
    }
}


public class cwh_75 {
    public static void main(String[] args) {
       mythr1 th = new mythr1();
       mythr1 th2 = new mythr1();
       th.start();
       try{
           
           th.join();
       }
       catch(Exception e){
           System.out.println(e);
       }
       th2.start();

        
    }    
}
