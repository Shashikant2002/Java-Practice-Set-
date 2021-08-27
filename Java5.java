import java.io.DataInputStream;

public class Java5 {
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        int intNumber = 0;
        float FloatNumber = 0.0f;

        try{
            System.out.println("Enter an Integer");
            intNumber = Integer.parseInt(in.readLine());
            System.out.println("Enter a float number: ");
            FloatNumber = Float.valueOf(in.readLine()).floatValue();
        }
        catch (Exception e){}
        System.out.println("intNumber = "+intNumber);
        System.out.println("FloatNumber = "+FloatNumber);

    }
    
}
