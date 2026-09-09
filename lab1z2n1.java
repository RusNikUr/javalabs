public class lab1z2n1 {
        public static void main(String[] args) {
            System.out.println(abs(5));
            System.out.println(abs(-3));
        }

        public static int abs(int x) {
            if (x < 0) {
                return -x;
            }
            return x;
        }
}
