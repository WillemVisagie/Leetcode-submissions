class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int i = 0 ;
        int j;
        for (j = 0; (j < k + 1) && (j < nums.length); j++) {
            if (set.contains(nums[j])) return true;
            set.add(nums[j]);
        }
        while (j < nums.length) {
            set.remove(nums[i++]);
            if (set.contains(nums[j])) return true;
            set.add(nums[j]);
            j++;
        }
        return false;
    }
}