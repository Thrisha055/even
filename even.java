import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range for summing odd numbers
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        int sum = 0;

        // Loop through the numbers and add the odd numbers to the sum
        for (int i = 1; i <= upperLimit; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                sum += i;
            }
        }

        // Output the result
        System.out.println("The sum of odd numbers up to " + upperLimit + " is: " + sum);
        
        scanner.close();
    }
}
