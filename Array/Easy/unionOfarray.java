import java.util.Scanner;
import java.util.TreeSet;

public class unionOfarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of array1: ");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter the size of array2: ");
        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];
        System.out.println("Enter the elements of array2: ");
        for (int i = 0; i < n1; i++) arr2[i] = sc.nextInt();

        TreeSet<Integer> st = new TreeSet<>();
        for (int i = 0; i < n; i++) st.add(arr1[i]);
        for (int i = 0; i < n1; i++) st.add(arr2[i]);

        int[] union = new int[st.size()];
        int i = 0;
        for (int val : st) union[i++] = val;

        System.out.println("Union of the two arrays: ");
        for (int val : union) System.out.print(val + " ");
    }
}