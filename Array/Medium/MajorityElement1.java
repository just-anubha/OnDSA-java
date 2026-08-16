import java.util.Scanner;

public class MajorityElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of an array : ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == a[i]) {
                    cnt++;
                }
            }
            if (cnt > (n / 2)) {
                System.out.println(a[i]);
                return;
            }
        }

        System.out.println("No majority element");
    }
}