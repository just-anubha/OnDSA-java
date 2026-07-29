import java.util.Scanner;
public class movezeroestoend_optimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        
        int []arr=new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<n;i++){

            if(arr[i]!=0){
                
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            }
        }
    System.out.println("final array is: ");
        for(int i=0;i<n;i++){
           System.out.println(arr[i]);
        }
    }
}