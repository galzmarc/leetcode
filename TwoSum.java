import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>(); // Store value -> index
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff)) {
        return new int[] {map.get(diff), i};
      } else {
        map.put(nums[i], i);
      }
    }
    return new int[] {};
  }
}