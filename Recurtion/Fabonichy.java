public class Fabonichy {

    static int fabonachy(int a, int b, int end) {
        if (end <= 0) {
            return a + b;
        }

        int c = a + b;

        // System.out.println(a + " + " + b);
        System.out.println(c);

        return fabonachy(b, c, end - 1);
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println(0);
        System.out.println(1);
        fabonachy(0, 1, n - 2);
    }
}
