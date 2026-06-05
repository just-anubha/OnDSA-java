import java.util.Scanner;
public class SelectionSort {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements of array: ");
    int i;
    for( i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for( i=0;i<n;i++){
        int minInd=i;
        for(int j=i+1;j<n;j++){
           if(arr[j]<arr[minInd]){
            minInd=j;
        }
        }
        int temp=arr[i];
        arr[i]=arr[minInd];
        arr[minInd]=temp;

        }
        for(i=0; i<n; i++){
    System.out.print(arr[i]+" ");
    }
}
}