package topics.maps.interactive;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {

        // her karakterin frekansını bul
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.containsKey(s.charAt(i))) {
                frequencyMap.put(s.charAt(i), frequencyMap.get(s.charAt(i)) + 1);
            } else {
                frequencyMap.put(s.charAt(i), 1);
            }
        }

        // ilk unique karakterin indexini bul
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
