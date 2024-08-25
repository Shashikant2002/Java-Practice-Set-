public class PowerOfN {

    public static int powerOfN(int n, int pow, int res) {

        if (pow <= 0) {
            return res;
        }

        int result;

        if (res == 0) {
            result = n;
        } else {
            result = res * n;

        }

        return powerOfN(n, pow - 1, result);
    }

    public static void main(String[] args) {
        int res = powerOfN(2, 2, 0);

        System.out.println("Result is: " + res);
    }
}
