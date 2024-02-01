import java.util.Scanner;
public class Integer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");
    }
}