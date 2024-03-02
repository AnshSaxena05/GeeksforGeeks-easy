import java.util.HashMap;
import java.util.Map;

public class gfg_First_element_to_occur_k_times {
    public int firstElementKTime(int n, int k, int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int elem : a) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
            if (map.get(elem) == k) {
                return elem;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        gfg_First_element_to_occur_k_times obj = new gfg_First_element_to_occur_k_times();
        int[] array = { 2, 3, 2, 5, 4, 3, 5, 6 };
        int n = array.length;
        int k = 2;

        int result = obj.firstElementKTime(n, k, array);

        if (result != -1) {
            System.out.println("The first element occurring " + k + " times is: " + result);
        } else {
            System.out.println("No element occurs " + k + " times in the array.");
        }
    }
}
