class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        Map<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            dict.put(nums[i], dict.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[k];
        int max;
        int keyToRemove = 0;
        for (int i = 0; i < k; i++) {
            max = -1;
            for (int key : dict.keySet()) {
                if (dict.get(key) > max) {
                    max = dict.get(key);
                    keyToRemove = key;
                }
            }
            ans[i] = keyToRemove;
            dict.remove(keyToRemove);
        }
        return ans;
    }
}
