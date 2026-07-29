import java.util.Scanner;
public class leftrotate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        System.out.println("The array elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}