import java.util.Scanner;

public class iterative{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
         int n=sc.nextInt();

         int[]arr=new int[n];

         System.out.println("Enter the array elements of an array: ");
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }

          

          int low=0;int high=n-1;
          System.out.println("Enter the target element: ");
          int target=sc.nextInt();

          while(low<=high){
                  
                  int mid=((low+high))/2;

                  if(target==arr[mid]){

                    System.out.println("element found");

                    return ;
                  }

                  else if(target>arr[mid]){

                    low=mid+1;
                  }
                  else{

                    high=mid-1;
                  }


          }

          System.out.println("Element not found");

          sc.close();

          
    }
}