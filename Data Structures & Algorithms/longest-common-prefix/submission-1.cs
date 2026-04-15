public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        int longest = 0;
        for (int i = 0; i < strs[0].Length; i++) {
            for (int j = 0; j < strs.Length; j++) {
                if (strs[j].Length == 0) {
                    return "";
                }
                if (i >= strs[j].Length || strs[0][i] != strs[j][i]) {
                    return strs[0].Substring(0, i);
                }
            }
            longest++;
        }
        return strs[0].Substring(0, longest);
    }
}