class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (dict.get(nums[i]) == null || dict.get(nums[i]) == 0) {
                dict.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}