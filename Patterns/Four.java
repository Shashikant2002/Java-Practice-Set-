package Patterns;

class Four {
    public static void main(String[] args) {

        int a = 5;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < a; j++) {
               
                if (i > j) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("");
        }
    }
}
