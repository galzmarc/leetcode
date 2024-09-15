// Remove Duplicates from Sorted Array
class Solution {
  public int removeDuplicates(int[] nums) {
    int k = 0; // Pointer for the last unique element

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[k]) {
        k++;
        nums[k] = nums[i];
      }
    }
    return k + 1;
  }
}
