class employe{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}
public class class2{
    public static void main(String[] args) {
       employe Shashikant = new employe();
       Shashikant.setname("Code With Shashikant"); 
       Shashikant.salary = 233;
       System.out.println(Shashikant.salary);
       System.out.println(Shashikant.getname());
    }
}
