public class MaximumSubarraySum {
  public long maximumSubarraySum(int[] nums, int k) {
    long maxSum = 0, windowSum = 0;
    HashSet<Integer> windowSet = new HashSet<>();

    int left = 0;
    for (int right = 0; right < nums.length; right++) {
      // If the element already exists in the window, slide the left pointer
      while (windowSet.contains(nums[right])) {
        windowSet.remove(nums[left]);
        windowSum -= nums[left];
        left++;
      }

      // Add the current element to the window
      windowSet.add(nums[right]);
      windowSum += nums[right];

      // Check if the window size is equal to k
      if (right - left + 1 == k) {
        maxSum = Math.max(maxSum, windowSum);
        // Slide the window by removing the leftmost element
        windowSet.remove(nums[left]);
        windowSum -= nums[left];
        left++;
      }
    }

    return maxSum;
  }
}
