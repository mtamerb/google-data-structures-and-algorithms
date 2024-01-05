package topics.arrays.and.strings.arrays;

import java.util.HashMap;

public class CheckIfNandItsDoubleExist {

    public static boolean checkIfExist(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for (int n : arr) {
            map.put(n, c);
            c++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i] * 2) && map.get(arr[i] * 2) != i)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        //int[] arr = {0, 0};
        System.out.println(checkIfExist(arr));
    }
}
