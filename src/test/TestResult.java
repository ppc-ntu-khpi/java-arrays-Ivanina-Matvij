package test;

//import domain.Exercise;
import java.util.*;

public class TestResult {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6}; // змініть масив за своїм бажанням
        int mostFrequent = findMostFrequent(arr);
        System.out.println("Number the most repeats: " + mostFrequent);
    }
    public static int findMostFrequent(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int mostFrequent = arr[0];
    int maxCount = 1;
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      if (map.containsKey(num)) {
        int count = map.get(num) + 1;
        map.put(num, count);
        if (count > maxCount) {
          maxCount = count;
          mostFrequent = num;
        }
      } else {
        map.put(num, 1);
      }
    }
    return mostFrequent;
  }
}

