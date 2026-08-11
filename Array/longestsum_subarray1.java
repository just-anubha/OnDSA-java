import java.util.Scanner;
public class longestsum_subarray1{
    public static void main(String[] args) {
        int len=0,i=0,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]arr=new int[n];

        System.out.println("Enter the elements of an array: ");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the required sum: ");
        int k=sc.nextInt();

        for(i=0;i<n;i++){
            int sum=0;
            for(j=i;j<n;j++){
                 sum=sum+arr[j];

                 if(sum==k){
               len=Math.max(len,j-i+1);
            }

            }
        }
    
        System.out.println("the longest subarray is: " +len);
    }
}