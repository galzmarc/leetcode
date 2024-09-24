public class RansomNote {
  public boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character, Integer> mMap = new HashMap<>();

    for (int i = 0; i < magazine.length(); i++) {
      mMap.put(magazine.charAt(i), mMap.getOrDefault(magazine.charAt(i), 0) + 1);
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      char c = ransomNote.charAt(i);
      if (!mMap.containsKey(c) || mMap.get(c) == 0) {
        return false;
      }
      mMap.put(c, mMap.get(c) - 1);
    }

    return true;
  }
}