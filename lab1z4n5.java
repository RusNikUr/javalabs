import java.util.Arrays;
public class lab1z4n5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int[] result = add(arr, ins, 3);
        System.out.println(Arrays.toString(result));
    }

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
}
