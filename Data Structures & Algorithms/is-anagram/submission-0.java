class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (dict.get(cur) == null) {
                dict.put(cur, 1);
            } else {
                dict.put(cur, dict.get(cur) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char cur = t.charAt(i);
            if (dict.get(cur) == null || dict.get(cur) == 0) {
                return false;
            }
            dict.put(cur, dict.get(cur) - 1);
        }
        return true;
    }
}
