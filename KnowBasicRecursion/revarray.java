import java.util.Scanner;
public class revarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();

        int []arr=new int[n];

       System.out.println("Enter elements of an array: ");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     
       }
       revarray(arr,0,n-1);
       System.out.println("reversed array is : ");
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }
    }

       static void revarray(int[] arr,int start,int end){

        if(start>=end){
            return ;
    
        }
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;

          revarray(arr,start+1,end-1);
       }
}
