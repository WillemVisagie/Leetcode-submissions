class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int xp = 0;
        List<Integer> ans = new ArrayList<>();
        while (xp < arr.length && arr[xp] <= x) xp++;
        int l = xp - 1;
        int r = xp;
        while ((l >= 0) && (r < arr.length) && (k > 0)) {
            if ((Math.abs(arr[l] - x) < Math.abs(arr[r] - x))
                || ((Math.abs(arr[l] - x) == Math.abs(arr[r] - x)) && (arr[l] < arr[r]))) {
                ans.add(arr[l--]);
            } else {
                ans.add(arr[r++]);
            }
            k--;
        }
        while (l >= 0 && k > 0) {
            ans.add(arr[l--]);
            k--;
        }
        while (r < arr.length && k > 0) {
            ans.add(arr[r++]);
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}