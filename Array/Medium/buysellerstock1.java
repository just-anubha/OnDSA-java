import java.util.Scanner;
public class buysellerstock{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]a=new int[n];

        System.out.println("Enter the eleemnts of an array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int mini=a[0];int profit=0;

    
        for(int i=0;i<n;i++){
            int cost=a[i]-mini;
            profit=Math.max(profit,cost);

            if(a[i]<mini){
                mini=a[i];
            }
        }
        System.out.println("profit is: "+profit);
    }
}