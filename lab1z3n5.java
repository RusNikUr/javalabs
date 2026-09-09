public class lab1z3n5 {
    public static void main(String[] args) {
        System.out.println(numLen(12567));
    }

    public static int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        int count = 0;
        long temp = Math.abs(x);
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }
}
