class Solution {
    public int[] productExceptSelf(int[] nums) {
     int prod = 1;
     int prod_no_zero = 1;
     int nz = 0;
     int[] ans = new int[nums.length];
     for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                prod_no_zero = prod_no_zero * nums[i];
            } else {
                nz++;
            }
            prod = prod * nums[i];
        }
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) { 
            if (nz == 1) {
                ans[i] = prod_no_zero;
            } else{
                ans[i] = 0;
            }
        } else {
            ans[i] = prod/nums[i];
        }
    }  
    return ans;
    }
}  
