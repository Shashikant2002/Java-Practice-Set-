class one{
    public void greet(){
        System.out.println("Hi i am shashikant good morning ");
    }
    public void name(){
        System.out.println("Hi i am shashikant good morning ");
    }
}
class two extends one{
    public void swagat(){
        System.out.println("aap ka swagat ha");
    }
    public void name(){
        System.out.println("aap ka swagat ha in class two : ");
    }
}



public class methodoverriding {
    public static void main(String[] args) {
    //  one obj = new one();
    //  obj.name();
     one obj1 = new two();
     obj1.greet();
     obj1.name();

        

    }
}
