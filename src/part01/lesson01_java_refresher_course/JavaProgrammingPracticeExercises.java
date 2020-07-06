package part01.lesson01_java_refresher_course;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaProgrammingPracticeExercises {
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

    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length()-1; i>=0; i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }

//    // Their Solution
//    public static String reverseString(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i --) {
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();
//    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(findDuplicate("abcd"));
        System.out.println(twoSum(new int[]{1,4,5,1,6}, 12));
        System.out.println(reverseString("abcde"));
    }
}
