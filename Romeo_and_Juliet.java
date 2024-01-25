import java.util.Scanner;
public class Rj{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=(5*x+10*y)/z;
        System.out.println(a);
    }
}