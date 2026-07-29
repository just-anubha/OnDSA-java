import java.util.Scanner;
    public class linearsearch{
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of an array: ");
            int n=sc.nextInt();
          
             int[]a=new int[n];

             System.out.println("Enter the elements of array: ");
             for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
             }

             boolean flag=false;
             System.out.println("Enter the element to be searched: ");
             int num=sc.nextInt();
             for(int i=0;i<n;i++){
                if(a[i]==num){
                    System.out.println(i);
                    flag=true;
                    break;
                }
             }

             if(flag==true){
                System.out.println("The number is found");
             }
             else{
                System.out.println("Number not found");
             }

            
        }
    }
