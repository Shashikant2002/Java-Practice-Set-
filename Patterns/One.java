package Patterns;

class One {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(("*  "));
            }
            System.out.print("\n");
        }
    }
}
