public class lab1z3n8 {
    public static void main(String[] args) {
        leftTriangle(4);
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
