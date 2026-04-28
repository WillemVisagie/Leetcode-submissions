class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int lh = 0;
        int rh = 0;
        int sum = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= lh) {
                    lh = height[l];
                } else {
                    sum += lh - height[l];
                }
                l++;
            } else {
                if (height[r] >= rh) {
                    rh = height[r];
                } else {
                    sum += rh - height[r];
                }
                r--;
            }
        }

        return sum;
    }
}