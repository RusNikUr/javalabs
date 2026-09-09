public class lab1z3n3 {
    public static void main(String[] args) {
        System.out.println(chet(9));
    }

    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }
}
