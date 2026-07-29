import java.util.Scanner;
public class left_rotateByK{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the  degree of rotation: ");
        int k=sc.nextInt();

        int[]temp=new int[k];

        for(int i=0;i<k;i++){ //store in temp
            temp[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){//shifting
            arr[i-k]=arr[i];
        }
        for(int i=(n-k);i<n;i++){ //put back temp
            arr[i]=temp[i-(n-k)];
        }
        System.out.println("The Rotated Array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}