class Solution {
    public int subarraySum(int[] nums, int k) {
    ArrayList<Integer> prefix = new ArrayList<>();
    prefix.add(nums[0]);
    for (int i = 1; i < nums.length; i++) {
        prefix.add(prefix.get(i-1) + nums[i]);
    }
    int cnt = 0;
    int cursum = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i; j < nums.length; j++) {
            if (i != j) {
                cursum = prefix.get(j) - (i > 0 ? prefix.get(i - 1) : 0);
                if (cursum == k) cnt++;
            } else {
                if (nums[i] == k) cnt++;
            }
        }
    }
    return cnt;
    }
}