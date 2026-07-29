import java.util.Scanner;
public class duplicate{
    public static void main(String[] args) {
        boolean duplicateFound=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of an array: ");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
       for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
           duplicateFound=true;
        }
    }
}   
if(duplicateFound==true){
    System.out.println("duplicate found");
}
else{
    System.out.println("duplicate not found");
}
    }
}