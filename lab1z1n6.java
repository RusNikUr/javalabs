public class lab1z1n6 {
    public static void main(String[] args) {
        System.out.println(isUpperCase('D'));
        System.out.println(isUpperCase('q'));
    }

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }
}
