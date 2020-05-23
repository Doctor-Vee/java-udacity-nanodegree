package part01.lesson01_java_refresher_course;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class CalculateWordsFrequencyAlphabeticallyUsingTreeMap {
    public static void calculateWordsFrequency(List<String> input) {
        TreeMap<String, Integer> freqMap = new TreeMap<>();
        for (String str : input) {
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        for (String word : freqMap.keySet()) {
            System.out.println(word + "|" + freqMap.get(word));
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello udacityNanodegree");
        calculateWordsFrequency(Arrays.asList("ababc", "xdef", "bacd", "ababc", "xbcd", "def", "bacd", "def", "bacd", "xdef", "bacd"));
    }
}
