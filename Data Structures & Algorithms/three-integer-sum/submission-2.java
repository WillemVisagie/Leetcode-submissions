class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    int l; 
    int r; 
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        l = i + 1;
        r = nums.length - 1;
        while (l < r) {
            if (nums[i] + nums[l] + nums[r] == 0) {
                ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                while (l < r && nums[l] == nums[l+1]) l++;
                while (r > l && nums[r] == nums[r-1]) r--;
                l++;
                r--;
            } else {
                if (nums[i] + nums[l] + nums[r] > 0) r--; else l++;
            }
        }
    }
    return ans;
    }
}
