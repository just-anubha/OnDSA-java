import java.util.Scanner;
public class maximumsubarray_optimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]a=new int[n];

      System.out.println("Enter the elements of array: ");
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
    int sum=0;int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){

        if(sum>=0){
            sum=sum+a[i];
                    max=Integer.max(max,sum);
        }

       else if(sum<0){
            sum=0;
        }
      }

      System.out.println("Maximum sum of subarray: "+max);
    }
    
}