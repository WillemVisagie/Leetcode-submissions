class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    int l; int r; long sum;
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i-1]) continue;
        for (int j = i + 1; j < nums.length; j++) {
            if (j > i + 1 && nums[j] == nums[j - 1]) continue;
            l = j + 1;
            r = nums.length - 1;
            while (l < r) {
                sum = (long) nums[i] + (long) nums[j] + (long) nums[l] + (long) nums[r];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (r > l && nums[r] == nums[r-1]) r--;
                    l++; r--;
                    continue;
                }
                if (sum > target) r--;
                else l++;
            }
        }
    }
    return ans;
    }
}