class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int l = m - 1;
    int r = n - 1;
    int p = m + n - 1;
    while (l >= 0 && r >= 0) {
        nums1[p--] = (nums1[l] > nums2[r]) ? nums1[l--] : nums2[r--];
    }
    while (l >= 0) {
        nums1[p--] = nums1[l--];
    }
    while (r >= 0) {
        nums1[p--] = nums2[r--];
    }
    }
}