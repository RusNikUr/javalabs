import java.util.Arrays;
public class lab1z4n10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, 2, -5};
        int[] result = deleteNegative(arr);
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
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
