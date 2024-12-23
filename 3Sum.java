import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> solution = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      // Skip duplicate values for the 'i' index
      if (i > 0 && nums[i] == nums[i - 1]) continue;

      int left = i + 1;
      int right = nums.length - 1;
      int target = -nums[i];

      while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) {
          // Found a valid triplet
          solution.add(List.of(nums[i], nums[left], nums[right]));          
          // Skip duplicate values for 'left' and 'right' to avoid duplicate triplets
          while (left < right && nums[left] == nums[left + 1]) left++;
          while (left < right && nums[right] == nums[right - 1]) right--;
          // Move pointers after processing a valid triplet
          left++;
          right--;
        } else if (sum > target) {
          right--;
        } else {
          left++;
        }
      }
    }
    return solution;
  }
}
