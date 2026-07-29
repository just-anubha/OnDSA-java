import java.util.Scanner;
public class movezeroestoend{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[]a=new int[n];

        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }

        int[]temp=new int[n];
        int j=0;  //store  non zero element of array in temp and zeroes automtically goes to end as originally array is filled with zeroes
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp[j]=a[i];
                j++;
            }
        }

        System.out.println("Final elements are: ");
         for(int i=0;i<n;i++){

            System.out.println(temp[i]);

        }  
        }

    }
