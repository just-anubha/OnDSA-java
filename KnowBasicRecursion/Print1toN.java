import java.util.Scanner;
public class Print1toN{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int N=sc.nextInt();
        PrintNumber( 1,N);
    }

   static void PrintNumber(int i,int N){
       if(i>N){
        return;
       }
       System.out.println(i);
       PrintNumber(i+1,N);
 
   }
}