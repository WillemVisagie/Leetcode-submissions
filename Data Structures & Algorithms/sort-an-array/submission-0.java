class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        mergeSort(nums, 0, nums.length -1);
        return nums;
    }

    public static void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = (l + (r - l)/2);

            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);

            merge(nums, l, mid, r);
        }
    }

    public static void merge(int[] nums, int l, int mid, int r) {
        int[] left = new int[mid - l + 1];
        int[] right = new int[r - mid];
        int[] res = new int[r - l + 1];
        for (int i = l; i <= mid; i++) {
            left[i - l] = nums[i];
        }
        for (int i = mid + 1; i <= r; i++) {
            right[i - mid - 1] = nums[i];
        }

        int lp = 0;
        int rp  = 0;
        int ctr = l;
        while (lp < left.length && rp < right.length) {
            if (left[lp] <= right[rp]) {
                nums[ctr++] = left[lp++];
            } else {
                nums[ctr++] = right[rp++];
            }
        }
        while (lp < left.length) {
            nums[ctr++] = left[lp++];
        }
        while (rp < right.length) {
            nums[ctr++] = right[rp++];
        }
    }
}