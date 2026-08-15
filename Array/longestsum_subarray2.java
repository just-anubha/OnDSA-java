import java.util.Scanner;
public class longestsum_subarray2{
    public static void main(String[] args) {
        int maxLen=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }

        long sum=arr[0];
        System.out.println("Enter the required sum: ");
        int k=sc.nextInt();

        int right=0;int left=0;   // <-- FIX 1: right now starts at 0

        while(right<n){

            //1
            while(left<=right && sum>k ){
                sum=sum-arr[left];
                left++;
            }
            //2
            if(sum==k){
                maxLen=Math.max(maxLen,(right-left+1));
            }
            right++;

            if(right<n){
                sum=sum+arr[right];
                // <-- FIX 2: "return maxLen;" removed from here
            }
        }

        System.out.println("Longest subarray length: "+maxLen);  // <-- FIX 2: printed after the loop ends
    }
}
