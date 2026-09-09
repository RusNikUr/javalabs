import java.util.Arrays;
public class lab1z4n4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = add(arr, 9, 3);
        System.out.println(Arrays.toString(result));
    }

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
}
