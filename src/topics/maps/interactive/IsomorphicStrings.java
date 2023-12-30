package topics.maps.interactive;

import java.util.HashMap;

public class IsomorphicStrings {


    public static boolean isIsomorphic(String s, String t) {


        // map oluştur
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // key value olarak ekle
            String key = String.valueOf(s.charAt(i));
            String value = String.valueOf(t.charAt(i));

            // key varsa value'yu kontrol et yok ise value eşlenmiş mi kontrol et eşlenmişse false , yok ise ekle
            if (hashMap.containsKey(key)) {
                if (!hashMap.get(key).equals(value)) {
                    return false;
                }
            } else {
                if (hashMap.containsValue(value)) {
                    return false;
                }
                hashMap.put(key, value);
            }
        }

        return true;
    }


    public static void main(String[] args) {

        String s = "badc";
        String t = "baba";

        System.out.println(isIsomorphic(s, t));
    }
}
