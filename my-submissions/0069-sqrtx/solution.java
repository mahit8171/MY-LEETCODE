class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // avoid overflow
            if ((long) mid * mid == x) {
                return mid;
            }
            else if ((long) mid * mid < x) {
                ans = mid;        // possible answer
                left = mid + 1;   // search right half
            }
            else {
                right = mid - 1;  // search left half
            }
        }

        return ans;
    }
}
