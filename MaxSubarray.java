public class MaxSubarray {
  public int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int curSum = 0;
    
    for (int n : nums) {
      if (curSum < 0) {
        curSum = 0;
      }
      curSum += n;
      maxSum = Math.max(curSum, maxSum);
    }
    return maxSum;
  }
}
