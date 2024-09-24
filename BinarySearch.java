public class BinarySearch {
  public int search(int[] nums, int target) {
    
    int low = 0, high = nums.length - 1;
    
    while (low <= high) {
      int mid = low + (high - low) / 2;
      int midVal = nums[mid];

      if (midVal < target) {
        low = mid + 1;
      } else if (midVal > target) {
        high = mid - 1;
      } else {
        return mid; // target found
      }
    }
    return -1;
  }
}