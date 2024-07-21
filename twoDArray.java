// import java.util.Scanner;

// public class twoDArray {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Rows of Array: ");
//         int row = sc.nextInt();
//         System.out.println("Enter Col of Array: ");
//         int col = sc.nextInt();

//         int[][] arr = new int[row][col];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < row; j++) {
//                 System.out.println("Input of " + "[" + i + "]" + "[" + j + "]" + ": ");
//                 int input = sc.nextInt();
//                 arr[i][j] = input;
//             }
//         }

//         System.out.println();
//         System.out.println("Output");

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < row; j++) {
//                 System.out.println("Output of " + "[" + i + "]" + "[" + j + "]" + ": " + arr[i][j]);
//             }
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;

public class twoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows of Array: ");
        int row = sc.nextInt();
        System.out.println("Enter Col of Array: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Input of " + "[" + i + "]" + "[" + j + "]" + ": ");
                int input = sc.nextInt();
                arr[i][j] = input;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Searching Input =>>>>>>>>>>>> ");
        int searchNum = sc.nextInt();

        

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (searchNum == arr[i][j]) {
                    System.out.println("Address of Value is " + "[" + i + "]" + "[" + j + "]" + ": " + arr[i][j]);
                }

            }
        }

        sc.close();
    }
}
