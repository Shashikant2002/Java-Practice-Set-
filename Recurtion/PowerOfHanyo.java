class PowerOfHanyo {
    public static void towerOfHanyo(int n, String source, String helper, String dest) {
        if (n <= 1) {
            System.out.println("Transfer Disk " + n + " From " + source + " to " + dest);
            return;
        }

        towerOfHanyo(n - 1, source, dest, helper);

        System.out.println("Transfer Disk " + n + " From " + source + " to " + dest);

        towerOfHanyo(n - 1, helper, source, dest);

    }

    public static void main(String[] args) {
        int n = 2;
        towerOfHanyo(n, "S", "H", "D");
    }
}
