import java.util.Scanner;
public class Print1toN{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int N=sc.nextInt();
        PrintNumber( N);
    }

   static void PrintNumber(int N){
       if(N==0){
        return;
       }
       PrintNumber(N-1);
       System.out.println(N);
 
   }
}