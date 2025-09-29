package _0001;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Main main = new Main();
        int[] result = main.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairIdx.containsKey(target - num)) {
                return new int[] {i, pairIdx.get(target - num)};
            }
            pairIdx.put(num, i);
        }
        return new int[]{};
    }
}
