package topics.arrays.and.strings.arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int count = 0;
        for (int n : nums) {
            if (n == 1) {
                count++;
                if(max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}
