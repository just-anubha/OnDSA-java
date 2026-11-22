class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            // check if left half is sorted
            if (nums[low] <= nums[mid]) {
                // left half is sorted, is target in its range?
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // otherwise the right half must be sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}