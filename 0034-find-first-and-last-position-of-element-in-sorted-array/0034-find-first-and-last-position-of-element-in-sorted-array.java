class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int start = -1;
        int last = -1;

        // first occurrence: save it, go LEFT
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                start = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // reset before the second search
        low = 0;
        high = n - 1;

        // last occurrence: save it, go RIGHT
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{start, last};
    }
}