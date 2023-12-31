package topics.maps.interactive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int n : nums1) {
            set.add(n);
        }

        for (int n : nums2) {
            if (set.contains(n)) {
                result.add(n);
            }
        }

        /*

        -> set to int[] için  stream kullanmadan da yapabiliriz.
            int[] answer = new int[result.size()];
            int i = 0;
            for(int n : result){
                answer[i++] = n;
            }
            return answer;
         */
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersection(new int[]{3, 1, 2}, new int[]{1})));

    }
}


