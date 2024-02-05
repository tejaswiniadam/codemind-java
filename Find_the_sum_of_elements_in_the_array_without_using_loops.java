import java.util.Arrays;
import java.util.Scanner;
public class ArraySumWithoutLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = Arrays.stream(array).sum();
        System.out.println(+sum);
    }
}
