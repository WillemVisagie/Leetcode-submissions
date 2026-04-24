class Solution {
    public String mergeAlternately(String word1, String word2) {
    StringBuilder out = new StringBuilder("");
    int l = 0;
    int r = 0;

    while (l < word1.length() && r < word2.length()) {
        out.append(word1.charAt(l++));
        out.append(word2.charAt(r++));
    }
    while (l < word1.length()) {
        out.append(word1.charAt(l++));
    }
    while (r < word2.length()) {
        out.append(word2.charAt(r++));
    }
    return out.toString();
    }
}