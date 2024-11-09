class Solution {
  public int[] topKFrequent(int[] nums, int k) {
      // Use hashmap to store numbers and their frequency
      HashMap<Integer, Integer> map = new HashMap<>();
      // Pass through the array to populate hashmap
      for (int n : nums) {
        map.put(n, map.getOrDefault(n, 0) + 1);
      }
      // Use a priority queue to keep track of the top k elements
      PriorityQueue<Map.Entry<Integer, Integer>> pq = 
      new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        pq.add(entry);
        if (pq.size() > k) {
          pq.poll();
        }
      }

      int[] result = new int[k];
      for (int i = k -1; i >= 0; i--) {
        result[i] = pq.poll().getKey();
      }
      return result;
  }
}
