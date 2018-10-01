// Question 6

// Print the elements of an array in the decreasing frequency
// if 2 numbers have same frequency then print the one which came first.

import java.util.*;

public class FrequencyQ6 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6};
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (!(map.containsKey(arr[i]))) {
                map.put(arr[i], 0);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println("Before Sorting : ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //if (entry.getValue()>1)
            System.out.println("Key : " + entry.getKey() + " Occurances : " + entry.getValue());
        }
        List<Map.Entry<Integer,Integer>> sortedList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        sortedList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
                if (t1.getValue() < t2.getValue())
                return 1;
            else if (t1.getValue() > t2.getValue())
                return -1;
            else
                return t2.getKey().compareTo(t1.getKey());
            }
        });
        System.out.println("After sorting : ");
        for (Map.Entry<Integer,Integer> integerEntry: sortedList){
            System.out.println("Key : " + integerEntry.getKey() + " Occurances : " + integerEntry.getValue());
        }
    }
}


//class MyComaparatorFrequency implements Comparator
//{
//    Comparator<Map.Entry<Integer, Integer>> com = new Comparator<Map.Entry<Integer, Integer>>() {
//        @Override
//        public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
//            int I1 = e1.getValue();
//            int I2 = e2.getValue();
//            int a1 = e1.getKey();
//            int a2 = e2.getKey();
//
//            if (I1 < I2)
//                return -1;
//            else if (I1 > I2)
//                return +1;
//            else
//                return 0;
//        }
//    }
//}
