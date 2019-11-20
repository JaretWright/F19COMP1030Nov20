import java.util.Scanner;

public class DivideZeroExceptionHandling {

    public static int quotient(int numerator, int denominator)
    {
           return numerator/denominator;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter a numerator: ");
        int numerator = keyboard.nextInt();

        System.out.printf("Enter a denominator: ");
        int denominator =keyboard.nextInt();

        System.out.printf("Result: %d/%d=%d%n", numerator, denominator,
                                                quotient(numerator,denominator));
    }
}
