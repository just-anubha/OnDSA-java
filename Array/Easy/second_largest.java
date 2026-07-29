import java.util.Scanner;     //better solution as compared to brutal solition but stil the time complexity is O[2n]
public class second_largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int largest=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element is: "+largest);
    int s_largest = Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if((s_largest<arr[j])&&(largest>arr[j])){
                s_largest=arr[j];
            }
        }
        if (s_largest == Integer.MIN_VALUE) {
    System.out.println("No second largest exists");
} else {
    System.out.println("Second largest element is: " + s_largest);
}
    }
}