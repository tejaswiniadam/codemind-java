import java.util.Scanner;
public class FindFactors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                k=i;
           System.out.print(k+" ");
            }
           
        }
    }
}