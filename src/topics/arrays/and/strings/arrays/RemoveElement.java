package topics.arrays.and.strings.arrays;

import java.util.Arrays;

public class RemoveElement {


    public static int removeElement(int[] nums, int val) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        Arrays.fill(nums, index, nums.length, 0);

        System.out.println(Arrays.toString(nums));
        return index;
    }

    public static void main(String[] args) {

        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}
