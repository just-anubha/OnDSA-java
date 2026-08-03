import java.util.Scanner;
public class PrintNto1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter n: ");
            int N=sc.nextInt();
            PrintRev(N,N);
        
    }

    static void PrintRev(int i,int N){

        if(i<1){
            return;
        }
        System.out.println(i);
        PrintRev(i-1,N);
    }
}