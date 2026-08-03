import java.util.Scanner;
public class pallindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out .println("Enter a string: ");
        String s=sc.nextLine();
        
        String s1=rev(s);
        
        if(s1.equalsIgnoreCase(s)){
            System.out.println("It is a pallindrome");
        }
        else{
            System.out.println("It is not a pallimdrome");
        }
    }

    static String rev(String s){
    if(s.length() <= 1){
        return s;
    }
    return rev(s.substring(1)) + s.charAt(0);
}
}

