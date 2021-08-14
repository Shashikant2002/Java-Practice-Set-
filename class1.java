 class employee{
    int id;
    int salary;
    String name;

public void printdetails(){
    System.out.println("My Id is: "+ id);
    System.out.println("and my name is: "+ name);

}
public int getsalary(){
    return salary;
}
}

public class class1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee Shashikant = new employee();
        employee harry = new employee();


        Shashikant.id = 34;
        Shashikant.salary = 20000;
        Shashikant.name = ("Shashikant");

        harry.id = 35;
        harry.salary = 30000;
        harry.name = ("Code With harry");



        harry.printdetails();
        Shashikant.printdetails();
        int salary = harry.getsalary();
        System.out.println(salary);
    }
}