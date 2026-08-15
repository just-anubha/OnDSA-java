import java.util.Scanner;

public class Twosum{
    public static void main(String[] args) {
        boolean flag=false;
        int i,j=0;
        int num1=0, num2=0;   // safe storage for the matched values

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]arr=new int[n];

        System.out.println("Enter elements of an array: ");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int sum=sc.nextInt();


        for( i=0;i<n;i++){
            for(j=i+1;j<n;j++){

                if((arr[i]+arr[j])==sum){
                    flag=true;
                    num1=arr[i];   // capture values the instant we find them
                    num2=arr[j];
                    break;
                }
           }
      }

      if(flag==true){
        System.out.println("The required numbers are: "+num1+" and "+num2);
      } else {
        System.out.println("No two numbers add up to the target.");
      }
    }
}