package topics.arrays.and.strings.arrays;

import java.util.Arrays;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {

        int count = 0;
        for (int n : arr) {
            if (n == 0) {
                count++;
            }
        }

        int[] temp = new int[arr.length + count];

        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp[t] = 0;
                temp[t + 1] = 0;
                t++;
            }
            temp[t] = arr[i];
            t += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }
}
