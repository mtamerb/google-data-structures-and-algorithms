package topics.maps.interactive;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        // set oluştur
        Set<Integer> set = new HashSet<>();

        // set içerisindeki elemanları kontrol et ve varsa true döndür yoksa ekle
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            /*
                !set.add(n) -> set.add(n) işlemi başarısız olursa true döndür
             */
            set.add(n);
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
