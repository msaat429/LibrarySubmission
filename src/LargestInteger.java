import java.util.Scanner;

public class LargestInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int largest = scan.nextInt();

        System.out.print("Enter second integer: ");
        int second = scan.nextInt();

        //take only the larger of the two numbers
        largest = second > largest ? second : largest;

        System.out.print("Enter third integer: ");
        int third = scan.nextInt();
        largest = third > largest ? third : largest;

        System.out.println(largest);
    }
}
