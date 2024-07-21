// public class start {
//     public static void main(String[] args) {
//         int star = 10;
//         for (int i = 0; i <= star; i++) {
//             for (int j = 0; j <= star; j++) {
//                 if(i == 0 || j == 0 || i == star || j == star){
//                     System.out.print(" * ");
//                 }else{
//                     System.out.print("   ");
//                 }
//             }
//             System.out.print(" \n");
//         }
//     }
// }

// public class start {
//     public static void main(String[] args) {
//         int star = 10;
//         for (int i = 0; i <= star; i++) {
//             for (int j = 0; j <= star - i; j++) {
//                     System.out.print("   ");
//             }
//             for (int j = 0; j <= i; j++) {
//                     System.out.print(" * ");
//             }
//             System.out.print(" \n");
//         }
//     }
// }

// public class start {
//     public static void main(String[] args) {
//         int star = 10;
//         int num = 1;
//         for (int i = 0; i < star; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(" " + (num) + " ");
//                 num++;
//             }
//             System.out.print(" \n");
//         }
//     }
// }

// public class start {
//     public static void main(String[] args) {
//         int star = 10;
//         for (int i = 0; i < star; i++) {
//             for (int j = 1; j <= i; j++) {
//                 int numMain = i + j;
//                 if (numMain % 2 == 0) {
//                     System.out.print("  1");
//                 } else {
//                     System.out.print("  0");
//                 }
//             }
//             System.out.print(" \n");
//         }
//     }
// }

// class Star {
//     public static void main(String[] args) {
//         int star = 5;

//         for (int i = 0; i < star; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }

//             int space = 2 * (star - i);

//             for (int j = 0; j < space; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//         for (int i = star; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }

//             int space = 2 * (star - i);

//             for (int j = 0; j < space; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }

/**
 * start
 */

import java.util.*;

public class start {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        System.out.print("Enter a number\n");

        a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2 * a; j++) {
                if (j <= i || (2 * a - i - 1) <= j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        for (int i = a; i >= 0; i--) {
            for (int j = 0; j < 2 * a; j++) {
                if (j <= i - 2 || (2 * a - i + 1) <= j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

        sc.close();
    }
}