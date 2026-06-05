import java.util.Scanner;
public class BubbleSort2{
    public static void main(String[] args) {
        int temp;
        int didswap=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int []arr=new int[n];
    

System.out.println("Enter elements of array: ");
for(int i=0;i<n;i++){

    arr[i]=sc.nextInt();
}

for(int i=n-1;i>=1;i--){
    didswap=0;
    for(int j=0;j<i;j++){
     if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        didswap=1;
     }
    }
    if(didswap==0){4
   break;
}
}

System.out.print("Sorted array: ");
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }
    }
}