import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N=sc.nextInt();
       int answer= Sum(N);
       System.out.println(answer);
    }

    static int Sum(int N){
        if(N==0){
            return 0;
        }
        return N+Sum(N-1);
        
    }
}