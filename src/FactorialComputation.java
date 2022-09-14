import java.util.Scanner;

public class FactorialComputation {

    //long supports input up to 26 before overflow, while int supports to 17
    public static long computeFactorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to compute factorial: ");

        int n = scan.nextInt();

        System.out.println("The factorial is " + computeFactorial(n));

    }

}
