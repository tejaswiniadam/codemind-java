import java.util.Scanner;
public class Kmph{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double n =sc.nextDouble();
        System.out.printf("%.2f",(n*1000)/3600);
    }
}