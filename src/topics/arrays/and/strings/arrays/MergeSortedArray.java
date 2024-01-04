package topics.arrays.and.strings.arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else {
            int k = 0;
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[k];
                k++;
            }
        }
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        //merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
