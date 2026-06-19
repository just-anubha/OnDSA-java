import java.util.Scanner;
    public class Factorial{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number: ");
            int N=sc.nextInt();
            int answer=fact(N);
            System.out.println("Factorial is: "+answer);
        }

        static int fact(int N){
            if(N<=1){
                return 1;
            }
            return N*fact(N-1);
            
        }
    }
