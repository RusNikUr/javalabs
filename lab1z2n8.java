public class lab1z2n8 {
    public static void main(String[] args) {
        System.out.println(age(5));
        System.out.println(age(31));
        System.out.println(age(44));
    }

    public static String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return x + " лет";
        }

        if (lastDigit == 1) {
            return x + " год";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }
}
