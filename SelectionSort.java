import java.util.Arrays;

public class SelectionSort {
  public static void selectionSort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      int smallest = Integer.MAX_VALUE;
      int smallestIndex = 0;
      for (int j = i; j < nums.length; j++) {
        if (nums[j] < smallest) {
          smallest = nums[j];
          smallestIndex = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[smallestIndex];
      nums[smallestIndex] = temp;
    }
  }

  public static void main(String[] args) {
    int[] test = {5, 2, 1, 3, 6, 4};
    selectionSort(test);
    System.out.println(Arrays.toString(test));
  }
}