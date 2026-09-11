class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int l = 1;
        int h = x;
        int ans = 0;

        while (l <= h) {

            int m = l + (h - l) / 2;

            if (m <= x / m) {
                ans = m;
                l = m + 1;
            }
            else {
                h = m - 1;
            }
        }

        return ans;
    }
}
