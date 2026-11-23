
class Solution {

    private long divisor(int[] nums, int k) {

        long d = 0;

        for (int pile : nums) {
            d = d + (pile + k - 1) / k;
        }

        return d;
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        for (int pile : nums) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (divisor(nums, mid) <= threshold) {

                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
