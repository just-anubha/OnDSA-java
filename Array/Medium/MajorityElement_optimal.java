import java.util.Scanner;
public class MajorityElement_optimal{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[]a=new int[n];

        System.out.println("Enter the elements of an array: ");

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
      int cnt=0;
      int element=0;

      //1: find a candidtate

      for (int i=0;i<n;i++){
        if (cnt==0){
            cnt=1;
             element=a[i];
        }
         
         else if(a[i]==element){
            cnt++;
         }
         else{
            cnt--;
         }
      }

      //verify the canditate appears more than n/2 times


      int actualcount=0;
      for(int i=0;i<n;i++){
        if(a[i]==element){
            actualcount++;
        }
      }

     if (actualcount > (n / 2)) {
            System.out.println(element);
        } else {
            System.out.println("No majority element");
        }
    }
}
