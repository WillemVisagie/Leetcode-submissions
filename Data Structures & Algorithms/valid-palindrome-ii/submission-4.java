class Solution {
    public boolean validPalindrome(String s) {
    boolean deleted = false;
    int l = 0;
    int r = s.length() - 1;
    while (l < r) {
        if (deleted && s.charAt(l) != s.charAt(r)) {
            return false;
        }
        if (s.charAt(l) != s.charAt(r)) {
            if (isPalindromeRight(s, r)) {
                r--;
                deleted = true;
            } else {
                if (isPalindromeLeft(s, l)) {
                    l++;
                    deleted = true;
                } else {
                    return false;
                }
            }
        }
        l++;
        r--;
    }
    return true;
    }

    private boolean isPalindromeRight(String s, int i) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (r == i) {
                r--;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isPalindromeLeft(String s, int i) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (l == i) {
                l++;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}