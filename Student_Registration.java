import java.util.*;
public class StudentRegistration{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       while(t-->0){
            int nfrnds=sc.nextInt();
            int mcap=sc.nextInt();
            int kenr=sc.nextInt();
            if(nfrnds<(mcap-kenr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}