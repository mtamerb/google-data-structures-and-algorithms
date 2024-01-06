package topics.arrays.and.strings.arrays;

public class ValidMountainArray {


    public static boolean validMountainArray(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        int hill = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] >= arr[i + 1]) {
                break;
            }
            hill++;
            left++;
        }

        for (int i = hill; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
            right++;
        }

        if (left == 0 || right == 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        //int[] arr = {0, 3, 2, 1};
        //int[] arr = {3, 5, 5};
        //int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(validMountainArray(arr));
    }
}
