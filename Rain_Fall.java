import java.util.*;
public class Rainfall{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=3 && x<7)
            System.out.print("MODERATE");
        else if(x>=7)
            System.out.print("HEAVY");
        else
            System.out.print("LIGHT");
    }
}