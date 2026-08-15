import java.util.ArrayList;
import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of array1 (sorted): ");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter the size of array2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of array2 (sorted): ");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

ArrayList<Integer> intersecArrayList = new ArrayList<>();

int i=0,j=0;
while(i<n1 && j<n2){
    
    if(arr1[i]<arr2[j]){
        i++;
    }
    else if(arr1[i]>arr2[j]){
        j++;
    }
    else{
        if(arr1[i]==arr2[j]){
           
           if(intersecArrayList.size()==0||intersecArrayList.get(intersecArrayList.size()-1)!=arr1[i]){
                intersecArrayList.add(arr1[i]);
           }
                i++;
                j++;
        }
    }
}
System.out.println("Intersection of the two arrays: ");
for (int val : intersecArrayList) {
    System.out.print(val + " ");
}
    }
}
        