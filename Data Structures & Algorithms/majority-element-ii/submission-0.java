class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length/3;
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> hash = new HashMap<>();
        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        for (int n : hash.keySet()) {
            if (hash.get(n) > threshold) {
                ans.add(n);
            }
        }
        return ans;
    }
}