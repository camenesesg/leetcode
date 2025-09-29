package _0049;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = new char[26];
            for (char c : str.toCharArray()) {
                charArray[c - 'a']++;
            }
            String key = String.valueOf(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new java.util.ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new java.util.ArrayList<>(map.values());
    }
}
