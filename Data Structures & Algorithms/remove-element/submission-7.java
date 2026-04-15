class Solution {
    public int removeElement(int[] nums, int val) {
    int r = nums.length - 1;
    int l = 0;
    int t;
    int c = 0;
    while (l <= r) {
        while (nums[l] == val && r >= 0 && l <= r) {
            c++;
            t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            r--;
        }
        l++;
    }
    return nums.length - c;    
    }
}