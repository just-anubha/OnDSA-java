import java.util.ArrayList;
import java.util.Scanner;

public class unionofarray_optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of array1 (sorted): ");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter the size of array2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of array2 (sorted): ");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;   // the two pointers, "A's card" and "B's card"

        // main loop: runs while BOTH piles still have cards
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // mop-up: only ONE of these two will actually do anything
        while (i < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println("Union of the two arrays: ");
        for (int val : union) System.out.print(val + " ");
    }
}