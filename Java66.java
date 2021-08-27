

class students{
    private int RollNo;
    private String StudentName;

    public students(){
         RollNo = 54;
         StudentName = "Shashikant";
   }

    public String getname(){return StudentName;}
    public int getid(){return RollNo;}
}

public class Java66 {
    public static void main(String[] args) {
        students Shashi = new students();
       
        System.out.println("My Name is: "+Shashi.getname());
      System.out.println("My Roll No. is: "+Shashi.getid());
    }
}
