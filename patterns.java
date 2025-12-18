class Pattern {
    public static void main(String[] args) {

        int n = 9;   // size (must be odd)
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // border of square OR middle row OR middle column
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1
                        || i == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
