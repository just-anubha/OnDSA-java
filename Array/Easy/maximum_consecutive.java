import java.util.Scanner;
public class maximum_consecutive{
    public static void main(String[] args) {
        int count=0;
        int maxi=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]arr=new int[n];

        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
             
             if(arr[i]==1){
                count++;
                maxi=Math.max(count,maxi);
             }
             else{
                count =0;
             }
        }
          System.out.println("Maximum consecutive sum is: "+maxi);
            }

        }
    