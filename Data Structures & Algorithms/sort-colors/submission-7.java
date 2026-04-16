class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int t;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == 2 && i < r) {
                t = nums[i];
                nums[i] = nums[r];
                nums[r] = t;
                r--;
            } 
            while (nums[i] == 0 && l < i) {
                t = nums[i];
                nums[i] = nums[l];
                nums[l] = t;
                l++;
            }
        }
    }
}