class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int c = 0;
        for (int l = 0; c < nums.length; l++) {
            int cur = l;
            int prev = nums[l];
            do {
                int next = (cur + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                cur = next;
                c++;
            } while (l != cur);
        }
    }
}