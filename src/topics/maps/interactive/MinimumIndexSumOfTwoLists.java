package topics.maps.interactive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {

        // map oluştur ve list1'i map'e ekle
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // list2'de map'te varsa list'e ekle
        List<String> list = new ArrayList<>();
        List<Integer> lenList = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                list.add(list2[i]);
                lenList.add(map.get(list2[i]) + i);
            }
        }

        // list'teki en küçük uzunluğu bul
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lenList.size(); i++) {
            if (lenList.get(i) < min) {
                min = lenList.get(i);
            }
        }

        // list'teki en küçük uzunluğa sahip elemanları bul
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lenList.size(); i++) {
            if (lenList.get(i) == min) {
                result.add(list.get(i));
            }
        }

        return result.toArray(new String[0]);
    }


    public static void main(String[] args) {

        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
}
