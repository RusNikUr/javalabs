public class lab1z1n2 {
    public static void main(String[] args) {
        System.out.println(sumLastNums(4568));
    }

    public static int sumLastNums(int x) {
        int lastDigit = x % 10;
        int preLastDigit = (x / 10) % 10;
        return lastDigit + preLastDigit;
    }
}