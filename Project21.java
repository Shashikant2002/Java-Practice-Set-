public class Project21 {
    public static void main(String[] args) {
        int rows = 4, i = 1, j = 1;

        while (i <= rows) {
            while (j <= i) {
                System.out.print("*");
                j++;

            }
            System.out.print("\n");
            i++;
            j = 1;
        }
    }
}