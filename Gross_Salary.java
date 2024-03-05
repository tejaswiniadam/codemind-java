import java.util.*;
public class GrossSalary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double basic_salary=sc.nextDouble();
        double da,hra;
        if(basic_salary<=10000){
            da=80*basic_salary/100;
            hra=20*basic_salary/100;
            System.out.printf("%.2f",basic_salary+da+hra);
        }
        else if(basic_salary<=20000){
            da=90*basic_salary/100;
            hra=25*basic_salary/100;
            System.out.printf("%.2f",basic_salary+da+hra);
        }
       else if(basic_salary>20000){
            da=95*basic_salary/100;
            hra=30*basic_salary/100;
            System.out.printf("%.2f",basic_salary+da+hra);
        }
    }
}