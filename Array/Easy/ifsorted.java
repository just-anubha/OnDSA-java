import java.util.Scanner;
public class ifsorted{
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt(); 
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("array not sorted");
        }
    }
}
