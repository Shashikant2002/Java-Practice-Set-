// class SumOfArr {

//     static int sum(int num) {

//         if (num <= 0) {
//             return 0;
//         }

//         System.out.println(num);

//         return (sum(num-1));
//     }

//     public static void main(String[] args) {
//         int num = 10;

//         int result = sum(num);

//         System.out.println("result =>>>>> " + result);

//     }
// }


class SumOfArr {

    static int sum(int num, int index) {

        if (index >= num) {
            return 0;
        }

        System.out.println(index);

        return (sum(num, index + 1));
    }

    public static void main(String[] args) {
        int num = 10;

        int result = sum(num, 0);

        System.out.println("result =>>>>> " + result);

    }
}