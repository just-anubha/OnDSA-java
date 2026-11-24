class Solution {

    private boolean CanBLoom(int[] bloomDay, int day, int m, int k) {

        int count = 0;
        int bloom = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                count++;
                if (count == k) {       // a full bouquet is ready
                    bloom++;
                    count = 0;
                }
            } else {
                count = 0;              // a gap breaks the run
            }
        }
        return bloom >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;                  // not enough flowers at all
        }

        int low = 1;
        int high = 0;
        int ans = -1;

        for (int d : bloomDay) {
            high = Math.max(high, d);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (CanBLoom(bloomDay, mid, m, k)) {
                ans = mid;              // this day works, try an earlier one
                high = mid - 1;
            } else {
                low = mid + 1;          // too early, go later
            }
        }
        return ans;
    }
}