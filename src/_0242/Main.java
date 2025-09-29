package _0242;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        if (Arrays.equals(sCharArray, tCharArray)) {
            return true;
        }
        return false;
    }
}
