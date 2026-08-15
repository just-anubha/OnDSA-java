import java.util.Scanner;

public class TwoSum_optimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int k = sc.nextInt();

        mergesort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        boolean found = false;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == k) {
                found = true;
                break;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(found);
    }

    static void mergesort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}