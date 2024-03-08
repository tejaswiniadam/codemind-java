import java.util.Scanner;
public class NumbersInReverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int i=n;i>=1;i--){
            rev=i;
            System.out.print(+rev+" ");
        }
    }
}