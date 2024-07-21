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
// class Star {
//     public static void main(String[] args) {
//         int star = 5;

//         for (int i = star; i > 0; i--) {

//             for(int j = 0; j<i-1;j++){
//                 System.out.print("  ");
//             }

//             for (int k = 0; k < star; k++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }

//     }
// }
// class Star {
//     public static void main(String[] args) {
//         int star = 5;

//         for (int i = 0; i < star; i++) {
//             for (int j = 0; j < star - i; j++) {
//                 System.out.print("  ");
//             }

//             for(int j = 0;j < i+1; j++){
//                 System.out.print(" " + i);
//             }
//             for(int j = 0;j < i; j++){
//                 System.out.print(" " + i);
//             }

//             System.out.println();
//         }
//     }
// }
// class Star {
//     public static void main(String[] args) {
//         int star = 5;

//         for (int i = 0; i < star; i++) {
//             for (int j = 0; j < star - i; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = i + 1; j > 0; j--) {
//                 System.out.print(" " + j);
//             }
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" " + (j + 2));
//             }

//             System.out.println();
//         }
//     }
// }
class Star {
    public static void main(String[] args) {
        int star = 10;

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star - i; j++) {
                System.out.print("  ");
            }

            for (int j = i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = star; i > 0-1; i--) {
            for (int j = 0; j < star - i; j++) {
                System.out.print("  ");
            }

            for (int j = i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}