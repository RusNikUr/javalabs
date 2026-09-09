public class lab1z2n2 {
    public static void main(String[] args) {
        System.out.println(safeDiv(5, 0));
        System.out.println(safeDiv(8, 2));
    }

    public static double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }
}
