public class lab1z1n10 {
    public static void main(String[] args) {
        int result = 5;
        result = lastNumSum(result, 11);
        result = lastNumSum(result, 123);
        result = lastNumSum(result, 14);
        result = lastNumSum(result, 1);
        System.out.println(result);
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
