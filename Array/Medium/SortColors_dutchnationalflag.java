import java.util.Scanner;
public class SortColors_dutchnationalflag{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]arr=new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){

            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;

                low++;
                mid++;
            }

            else if(arr[mid]==1){
                mid++;
            }

            else if (arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;

                high--;
                mid++;
            }
        }
            System.out.println("The sorted array is: ");
            for (int i=0;i<n;i++){

                System.out.print(arr[i] + " ");

            }
                
            }
}