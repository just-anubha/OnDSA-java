import java.util.Scanner;

public class missing_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int n1 = n + 1;

        int xor1 = 0; // XOR of 1 to n1
        int xor2 = 0; // XOR of array elements

        for (int i = 1; i <= n1; i++) {
            xor1 = xor1 ^ i;
        }

        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
        }

        int missing_number = xor1 ^ xor2;
        System.out.println("Missing number is : " + missing_number);
    }
}