import java.util.Scanner;
public class Grades{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        double res=((a+b+c+d+e)/500.0)*100.0;
        if(res>=90){
            System.out.println("Grade A");
        }
         else if(res>=80&& res<90){
            System.out.println("Grade B");
        }
         else if(res>=70 && res<80){
            System.out.println("Grade C");
        }
        else if(res>=60 && res<70){
            System.out.println("Grade D");
        }
        else if(res>=40 && res<60){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
        
    }
}