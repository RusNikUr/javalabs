import java.util.Arrays;
public class lab1z4n9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        int[] result = findAll(arr, 2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
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
}
