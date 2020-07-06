package part01.lesson01_java_refresher_course;

import java.util.*;
import java.util.stream.Collectors;

public class JavaProgrammingPracticeExercises {
    /*
    findDuplicate
    Complete find the first duplicate character in a string.
    Complete the following method so given a string it returns the index of the first duplicated character or -1 if there are no duplicated characters.
     */
    public static int findDuplicate(String input) {
        List<Character> characters = new ArrayList<>();
        int index = 0;
        for (char c : input.toCharArray()) {
            if (characters.contains(c)) return index;
            characters.add(c);
            index++;
        }
        return -1;
    }

//    //Their Solution
//    public static int findDuplicate(String input) {
//        Set<Character> seen = new HashSet<>();
//        for (int i = 0; i < input.length(); i++) {
//            if (seen.contains(input.charAt(i))) {
//                return i;
//            } else {
//                seen.add(input.charAt(i));
//            }
//        }
//        return -1;
//    }


    /*
    Complete the “two sum” coding problem.
    Given an integer array, return true if two numbers in this array can be summed to target.
     */
//    public static boolean twoSum(int[] nums, int target) {
//        for(int i = 0; i < nums.length; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[i] + nums[j] == target) return true;
//            }
//        }
//        return false;
//    }

    //Their Solution - Makes sense ... reduces time complexity as compared to mine
    public static boolean twoSum(int[] nums, int target) {
        Set<Integer> twoSumSet = new HashSet<>();
        for (int num : nums) {
            if (twoSumSet.contains(num)) {
                return true;
            }
            twoSumSet.add(target - num);
        }
        return false;
    }


    /*
    Complete the “String reverse” coding problem.
    Write a function that takes a string as input and returns the string reversed.
     */
    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder(); //The IDE advised me to use StringBuilder instead of just using String which I used earlier
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

//    // Their Solution
//    public static String reverseString(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i --) {
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();
//    }


    /*
    Complete the “find top k larger number” in an unsorted integer array.
    Given an unsorted integer array, return the top k larger number in a sorted list. The k is always less than array size. Make sure the time complexity is less than O(nlogn).
     */
//public static int[] topKLarger(int [] array, int k){
//        Arrays.sort(array);
//        for (int i = 0; i < array.length/2; i++){
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        return Arrays.copyOf(array, k);
//}

    public static int[] topKLarger(int [] array, int k){
        Arrays.sort(array);
        return Arrays.copyOfRange(array, array.length - k, array.length);
    }

//    // Idea from their Solution
//    public static List<Integer> topKLarger(int[] array, int k) {
//        TreeSet<Integer> arraySet = new TreeSet<>();
//        for (int num : array) {
//            arraySet.add(num);
//            if (arraySet.size() > k) arraySet.pollFirst();
//        }
//        return arraySet.stream().collect(Collectors.toList());
//    }


    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(findDuplicate("abcd"));
        System.out.println(twoSum(new int[]{1, 4, 5, 1, 6}, 12));
        System.out.println(reverseString("abcde"));
        System.out.println(Arrays.toString(topKLarger(new int[]{2, 11, 5, 4, 7, 3, 8, 9}, 3))); // for my solution
//        System.out.println(topKLarger(new int[]{2, 11, 5, 4, 7, 3, 8, 9}, 5)); // for their solution
    }
}
