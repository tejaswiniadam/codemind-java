import java.util.Scanner;

public class SumFirstLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = sumFirstLastDigits(number);
        System.out.println(+ sum);
    }

    // Function to find the sum of the first and last digits of a number
    public static int sumFirstLastDigits(int num) {
        // If the number is negative, make it positive
        num = Math.abs(num);
        
        // Extract the last digit
        int lastDigit = num % 10;

        // Loop to get the first digit
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;

        // Return the sum of first and last digits
        return firstDigit + lastDigit;
    }
}
