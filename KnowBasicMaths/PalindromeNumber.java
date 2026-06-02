import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: " );
        int n=sc.nextInt();
        int rem=0,rev=0;
        int num=n;
        while(n!=0){
         rem=n%10;
         rev=rev*10+rem;
         n=n/10;
        }
        System.out.println("Reverse of a digit is: "+rev);

    if(rev==num){
        System.out.println("Its a pallindrome");
    }
else{
    System.out.println("Its not a pallindrome");
}
}
}
