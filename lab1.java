public class lab1 {

    public static void main(String[] args) {
        System.out.println("=== Задание 1 ===");
        System.out.println("Номер 2: " + sumLastNums(4568));            // 14
        System.out.println("Номер 3: " + charToNum('3'));               // 3
        System.out.println("Номер 6: " + isUpperCase('D'));             // true
        System.out.println("Номер 6: " + isUpperCase('q'));             // false
        System.out.println("Номер 8: " + isDivisor(3, 6));              // true
        System.out.println("Номер 8: " + isDivisor(2, 15));             // false
        System.out.println("Номер 10: " + runLastNumSum());             // 4

        System.out.println("\n=== Задание 2 ===");
        System.out.println("Номер 1: " + abs(5));                       // 5
        System.out.println("Номер 1: " + abs(-3));                      // 3
        System.out.println("Номер 2: " + safeDiv(5, 0));                // 0.0
        System.out.println("Номер 2: " + safeDiv(8, 2));                // 4.0
        System.out.println("Номер 7: " + sum2(5, 7));                   // 20
        System.out.println("Номер 7: " + sum2(8, -1));                  // 7
        System.out.println("Номер 8: " + age(5));                       // 5 лет
        System.out.println("Номер 8: " + age(31));                      // 31 год
        System.out.println("Номер 8: " + age(44));                      // 44 года
        System.out.println("Номер 9: " + day(5));                       // пятница
        System.out.println("Номер 9: " + day(8));                       // это не день недели

        System.out.println("\n=== Задание 3 ===");
        System.out.println("Номер 3: " + chet(9));                      // 0 2 4 6 8
        System.out.println("Номер 5: " + numLen(12567));                // 5
        System.out.println("Номер 7:");
        square(4);
        System.out.println("Номер 8:");
        leftTriangle(4);
        System.out.println("Номер 9:");
        rightTriangle(4);

        System.out.println("\n=== Задание 4 ===");
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Номер 4: " + java.util.Arrays.toString(add(arr1, 9, 3)));
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        System.out.println("Номер 5: " + java.util.Arrays.toString(add(arr2, ins, 3)));
        int[] arr3 = {1, 2, 3, 4, 5};
        reverse(arr3);
        System.out.println("Номер 6: " + java.util.Arrays.toString(arr3));
        int[] arr4 = {1, 2, 3, 8, 2, 2, 9};
        System.out.println("Номер 9: " + java.util.Arrays.toString(findAll(arr4, 2)));
        int[] arr5 = {1, 2, -3, 4, -2, 2, -5};
        System.out.println("Номер 10: " + java.util.Arrays.toString(deleteNegative(arr5)));
    }

    // задание 1

    // номер 2
    public static int sumLastNums(int x) {
        int lastDigit = x % 10;
        int preLastDigit = (x / 10) % 10;
        return lastDigit + preLastDigit;
    }

    // номер 3
    public static int charToNum(char x) {
        return x - '0';
    }

    // номер 6
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // номер 8
    public static boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    // номер 10
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static int runLastNumSum() {
        int result = 5;
        result = lastNumSum(result, 11);
        result = lastNumSum(result, 123);
        result = lastNumSum(result, 14);
        result = lastNumSum(result, 1);
        return result;
    }

    // задание 2

    // номер 1
    public static int abs(int x) {
        if (x < 0) return -x;
        return x;
    }

    // номер 2
    public static double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    // номер 7
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }

    // номер 8
    public static String age(int x) {
        int lastDigit = x % 10;
        int lastTwo = x % 100;
        if (lastTwo >= 11 && lastTwo <= 14) return x + " лет";
        if (lastDigit == 1) return x + " год";
        if (lastDigit >= 2 && lastDigit <= 4) return x + " года";
        return x + " лет";
    }

    // номер 9
    public static String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    // задание 3

    // номер 3
    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }

    // номер 5
    public static int numLen(long x) {
        if (x == 0) return 1;
        int count = 0;
        long temp = Math.abs(x);
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // нрмер 7
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // номер 8
    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // номер 9
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // задание 4

    // номер 4
    public static int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    // номер 5
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }
        return result;
    }

    // номер 6
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // номер 9
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    // номер 10
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
