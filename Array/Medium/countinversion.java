class Solution {
    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        return mergesort(nums, 0, n - 1);
    }

    long mergesort(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = (low + high) / 2;

        long leftCount = mergesort(nums, low, mid);
        long rightCount = mergesort(nums, mid + 1, high);

        long mergeCount = merge(nums, low, mid, high);

        return leftCount + rightCount + mergeCount;
    }

    long merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;

        int[] temp = new int[high - low + 1];
        int k = 0;
        long count = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];

                count += mid - left + 1;
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }

        return count;
    }
}