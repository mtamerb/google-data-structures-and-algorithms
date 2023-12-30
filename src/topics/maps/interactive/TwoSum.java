package topics.maps.interactive;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;

        int[] dizi = twoSum(nums, target);
        System.out.println(Arrays.toString(dizi));
    }

    public static int[] twoSum(int[] nums, int target) {

        // map oluştur ve nums dizisini map'e ekle
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        // map'te target - nums[i] var mı kontrol et
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // map'te varsa ve i ile aynı değilse result'a ekle
            if (hashMap.containsKey(complement) && hashMap.get(complement) != i) {
                result[0] = i;
                result[1] = hashMap.get(complement);
                break;
            }
        }

        return result;
    }
}
