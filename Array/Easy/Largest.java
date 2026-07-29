import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
         int largest=arr[0];

         for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
             largest=arr[i];
            }
         }
         System.out.println("Largest element is: "+largest);
        }
    }