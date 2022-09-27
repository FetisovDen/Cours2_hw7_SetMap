import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 100, 6, 2, 3, 4, 4, 5, 5, 6, 7, 9, 100, 5, 66, 11, 25));
        for (int i = 1; i < nums.size(); i++) {
            if ((nums.get(i) % 2) != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        //Задание 2
        System.out.println();
        SortedSet<Integer> numsDop = new TreeSet<Integer>(nums);
        for (int i : numsDop) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
        }
        //Задание 3
        System.out.println();
        List<String> nums1 = new ArrayList<>(List.of("dsa", "dsa", "era", "eas", "era"));
        SortedSet<String> numsDop1 = new TreeSet<String>(nums1);
        System.out.println(numsDop1);


        //Задание 4
        System.out.println();
        List<String> nums3 = new ArrayList<>(List.of("dsa", "dsa", "dsa", "era", "eas", "era"));

        Map<String, Integer> countMap = new HashMap<>();
        for (String item : nums3) {

            if (countMap.containsKey(item))
                countMap.put(item, countMap.get(item) + 1);
            else
                countMap.put(item, 1);
        }
        System.out.println(countMap);
        for (int o : countMap.values()) {
            System.out.print(o+" ");
        }

    }


}
