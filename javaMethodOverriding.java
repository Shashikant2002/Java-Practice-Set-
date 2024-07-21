class A{
    public int a;
    public int shashi(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class b extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class b");
    }
    public void meth3(){
        System.out.println("I am method 3 of class b");
    }
}

public class javaMethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        b B = new b();
        B.meth2();
    }
    
}
