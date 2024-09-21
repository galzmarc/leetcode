public class MaxArea {
  public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    int p1 = 0, p2 = height.length - 1;
    while (p1 < p2) {
      int area = Math.min(height[p1], height[p2]) * (p2 - p1);
      if (area > max) {
        max = area;
      }
      // Moving the pointer that points to the lower line
      if (height[p1] < height[p2]) {
        p1++;
      } else {
        p2--;
      }
    };
    return max;
}
}