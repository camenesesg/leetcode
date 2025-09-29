package _0438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s = "aaabb";
        String p = "bb";
        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<>();
        if (s.length() < p.length()) return indexes;
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (Arrays.equals(pCount, sCount)) {
                indexes.add(i);
            }
            if (i + p.length() < s.length()) {
                sCount[s.charAt(i) - 'a']--;
                sCount[s.charAt(i + p.length()) - 'a']++;
            }
        }
        return indexes;
    }
}
