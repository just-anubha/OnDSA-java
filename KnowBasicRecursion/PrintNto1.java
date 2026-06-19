import java.util.Scanner;
public class PrintNto1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter n: ");
            int N=sc.nextInt();
            PrintRev(N);
        
    }

    static void PrintRev(int N){

        if(N==0){
            return;
        }
        System.out.println(N);
        N--;
        PrintRev(N);
    }
}