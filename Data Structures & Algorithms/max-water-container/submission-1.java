class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int l = 0; 
        int r = heights.length - 1;
        while (l < r) {
            int cur = (r - l) * Math.min(heights[l], heights[r]);
            if (cur > max) {
                max = cur;
            }
            if (heights[l] < heights[r]) l++;
            else r--;
        }
    return max;
    }
}
