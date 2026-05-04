class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<>();
        int ans = 0; int l = 0; int r = 0;
        while (r < s.length()) {
            if (!hashSet.contains(s.charAt(r))) {
                hashSet.add(s.charAt(r++));
                if (hashSet.size() > ans) ans = hashSet.size();
            } else {
                hashSet.remove(s.charAt(l++));
            }
        }
        return ans;
    }
}