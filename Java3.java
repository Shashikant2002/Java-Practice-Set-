//An Application With Two Class

class room{
    float length;
    float bredth;

    void getdaata(float a, float b){
        length = a;
        bredth = b;
    }
}

public class Java3 {
    public static void main(String[] args) {
        float area;
        room room1 = new room();
        room1.getdaata(3, 4);
        area = room1.length + room1.bredth;
        System.out.println("Area is: "+area);
    }
    
}
