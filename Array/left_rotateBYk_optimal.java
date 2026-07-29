import java.util.Scanner;
public class left_rotateBYk_optimal{   //optimal solution that reducuse space complexity to O[1]
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]arr=new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the degree of rotation: ");
        int k=sc.nextInt();

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

        System.out.println("The rotated array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    static void reverse(int[]arr,int start,int end){
        
        

        if(start>=end){
            return ;
    
        }
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;

          reverse(arr,start+1,end-1);
       }
    }