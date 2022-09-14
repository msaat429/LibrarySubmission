import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to compute fibonacci: ");

        int n = scan.nextInt();
        if (n > 0) {
            int fib = 1;
            int last = 0;

            //an iterative solution runs in O(n) which is much faster than recursively with O(2^n)
            for (int i = 1; i < n; i++) {
                int temp = fib;
                fib = fib + last;
                last = temp;
            }
            System.out.println("The fibonacci number is " + fib);
        } else {
            System.out.println("Invalid number!");
        }


    }
}
