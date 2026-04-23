class Solution {
    public int firstMissingPositive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    Integer cur = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
            set.add(nums[i]);
        }    
    }
    while (set.contains(cur + 1)) {
        cur++;
    }
    return cur + 1;
    }
}