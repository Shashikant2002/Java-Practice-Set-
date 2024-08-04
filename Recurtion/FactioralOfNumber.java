public class FactioralOfNumber {

    static int fatioral(int num) {
        if (num <= 0 || num == 0) {
            return 1;
        }
        
        int fact_1 = fatioral(num - 1) * num;

        return fact_1;

    }

    public static void main(String[] args) {
        System.out.println("hello   " + fatioral(5));

        

    }
}
