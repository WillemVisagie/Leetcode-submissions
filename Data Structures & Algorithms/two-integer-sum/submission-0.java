class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> dict = new HashMap<>(); // value : idx 
    for (int i = 0; i < nums.length; ++i) {
        int complement = target - nums[i];
        if (dict.getOrDefault(complement, -1) != -1) {
            int j = dict.get(complement);
            return new int[] {Math.min(i, j), Math.max(i, j)};
        }
        dict.put(nums[i], i);
    }
    return new int[] {};    
    }
}
