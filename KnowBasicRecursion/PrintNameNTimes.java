
import java.util.Scanner;
public class PrintNameNTimes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the number of times to be printed: ");
        int N=sc.nextInt();
        PrintName(name, N);
    }


    static void PrintName(String name,int N){
       if(N==0){
            return;
        }
     System.out.println("Name is: "+name);
     N--;
     PrintName(name,N);
    }
}