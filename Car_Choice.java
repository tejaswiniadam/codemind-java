import java.util.Scanner;
public class CarChoice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            double x1=sc.nextDouble();
            double x2=sc.nextDouble();
            double y1=sc.nextDouble();
            double y2=sc.nextDouble();
            if((y1/x1)<(y2/x2))
                System.out.println("-1");
            else if((y1/x1)==(y2/x2))
                System.out.println("0");
            else
                System.out.println("1");
    }
}
}