  class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;                       // default: goes at the end

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;                 // possible spot, save it
                high = mid - 1;            // look left for an earlier one
            } else {
                low = mid + 1;             // too small, go right
            }
        }
        return ans;
    }
}