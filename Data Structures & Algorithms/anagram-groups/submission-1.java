class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String ss = new String (sorted);
            if (dict.get(ss) == null) {
                dict.put(ss, new ArrayList<>());
            }
            dict.get(ss).add(strs[i]);
        }
        List<List<String>> res = new ArrayList<>(dict.values());
        return res;
    }
}
