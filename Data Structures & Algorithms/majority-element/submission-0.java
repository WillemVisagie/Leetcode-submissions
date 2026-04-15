class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        for (int num : nums) {
            dict.put(num, dict.getOrDefault(num, 0) + 1);
        }
        for (int key : dict.keySet()) {
            if (dict.get(key) > nums.length/2) {
                return key;
            }
        }
        return -1; 
       }
}