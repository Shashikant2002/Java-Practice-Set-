

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("I am a Thread......................");
        }
    }
}

public class cwh_73 {
    public static void main(String[] args) {
        mythr t = new mythr("Shashikant");
        mythr t2 = new mythr("Shashikant ...............");
        t.start();
        System.out.println("ID of the Thread: "+ t.getId());
        System.out.println("ID of the Name: "+ t.getName());
        // System.out.println("ID of the Class: "+ t.getClass());
        // System.out.println("ID of the State: "+ t.getState());

        System.out.println("ID of the Thread: "+ t2.getId());
        System.out.println("ID of the Name: "+ t2.getName());
        // System.out.println("ID of the Class: "+ t2.getClass());
        // System.out.println("ID of the State: "+ t2.getState());
    }
    
}
