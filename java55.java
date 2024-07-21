class employe{
   int id;
   String name;

   public void display(){
       System.out.println("My id is: "+ id);
       System.out.println("My Name is: "+ name);
   }

}

public class java55 {
    public static void main(String[] args) {
        employe shivam = new employe();
        shivam.id = 12;
        shivam.name = "Shivam";
        employe prince = new employe();
        prince.id = 13;
        prince.name = "prince";

       shivam.display();
       prince.display();  
    }
}



