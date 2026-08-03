 
import java.util.Scanner;
public class PrintNameNTimes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the number of times to be printed: ");
        int N=sc.nextInt();
        PrintName(name,1, N);
    }


    static void PrintName(String name,int i,int N){
       if(i>N){
            return;
        }
     System.out.println("Name is: "+name);
     
     PrintName(name,i+1,N);
    }
}