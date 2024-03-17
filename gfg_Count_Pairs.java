import java.util.HashSet;
import java.util.LinkedList;

public class gfg_Count_Pairs {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
            int x) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for (int i : head1)
            hs.add(i);
        for (int i : head2)
            if (hs.contains(x - i))
                count++;
        return count;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);
        int sum = 7;
        int pairsCount = gfg_Count_Pairs.countPairs(list1, list2, sum);
        System.out.println("Number of pairs with sum " + sum + ": " + pairsCount);
    }
}
