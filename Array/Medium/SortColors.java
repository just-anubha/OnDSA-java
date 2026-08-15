import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
 
        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }

        int i = 0;
        for (int j = 0; j < cnt0; j++) {
            arr[i++] = 0;
        }
        for (int j = 0; j < cnt1; j++) {
            arr[i++] = 1;
        }
        for (int j = 0; j < cnt2; j++) {
            arr[i++] = 2;
        }

        System.out.println("The sorted array is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}