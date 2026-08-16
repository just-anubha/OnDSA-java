import java.util.Scanner;
public class maximumsum_subarray_brute{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]a=new int[n];

        System.out.println("Enter the elements of array:  ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum=0;

            for(int j=i;j<n;j++){
                

                for(int k=i;k<=j;k++){

                    sum=sum+a[k];

                }
                max=Integer.max(max,sum);

            }
    
        }
        System.out.println("The maximum sum is: "+max);
    }
}