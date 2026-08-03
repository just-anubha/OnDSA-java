import java.util.Scanner;
public class InsertionSort {
public static void main(String args[]){
    int temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements of array: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
    }
    System.out.print("Sorted array: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}4