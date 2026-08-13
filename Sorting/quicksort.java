import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void quicksort(int[] arr, int lower, int upper) {
        if (lower < upper) {
            int partition = f(arr, lower, upper);
            quicksort(arr, lower, partition - 1);
            quicksort(arr, partition + 1, upper);
        }
    }

    static int f(int[] arr, int lower, int upper) {
        int pivot = arr[lower]; // pivot = first element
        int i = lower;

        for (int j = lower + 1; j <= upper; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // move pivot into its correct sorted position
        int temp = arr[lower];
        arr[lower] = arr[i];
        arr[i] = temp;

        return i;
    }
}