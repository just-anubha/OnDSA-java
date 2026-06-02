import java.util.Scanner;
public class day1_4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        double a=0,sum=0;
        int count=0;
        int num=n;
        int temp=n;

        while(temp!=0){
            count=count+1;
            temp=temp/10;
        }
        while(n!=0){
          a=n%10;
          sum=sum+Math.pow(a,count);
          n=n/10;
        }
        if(sum==num){
            System.out.println("Its an armstrong number");
        }
        else{
            System.out.println("Its not an armstrong number");
        }
    }
}