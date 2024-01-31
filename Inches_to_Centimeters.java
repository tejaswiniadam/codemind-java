import java.util.Scanner;
public class Height{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double cm=sc.nextDouble();
        System.out.printf("%.2f",(2.54*cm));
    }
}