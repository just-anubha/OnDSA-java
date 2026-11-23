import java.util.*;

class Solution {
    /*
    Returns the element that appears
    only once in the sorted array.
    */
    public int singleNonDuplicate(int[] arr) {
        // Left boundary of the current search range.
        int low = 0;

        // Right boundary of the current search range.
        int high = arr.length - 1;

        // Keep shrinking the range until only one position remains.
        while (low < high) {
            // Calculate the middle index safely.
            int mid = low + (high - low) / 2;

            // Move to the first index of the expected pair.
            if (mid % 2 == 1) {
                mid--;
            }

            // A proper pair means the single element is further right.
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                // The broken pair means the answer is at mid or to the left.
                high = mid;
            }
        }

        return arr[low];
    }
}

public class Main {
    // Driver code starts
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        Solution obj = new Solution();
        System.out.println(obj.singleNonDuplicate(arr));
    }
}