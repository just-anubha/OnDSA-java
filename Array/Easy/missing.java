import java.util.Scanner;
public class missing{
      public static void main(String[] args) {
        int expected_sum=0,actual_sum=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of an array: ");
          int n=sc.nextInt();
          int[]arr=new int[n];
          System.out.println("Enter the elements of an array: ");
          for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
          }

          for(int i=0;i<n;i++){
            actual_sum=arr[i]+actual_sum;
          }
         int n1 = n + 1;

           expected_sum=((n1*(n1+1))/2);


           int missing_number=expected_sum-actual_sum;
           System.out.println("Missing number is : "+missing_number);
             }
}