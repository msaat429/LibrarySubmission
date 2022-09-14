import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");

        String input = scan.next();

        StringBuilder builder = new StringBuilder();
        builder.append(input);

        //StringBuilders have a built-in reverse method which helps reduce lines of code needed
        builder.reverse();

        String output = builder.toString();
        System.out.println(output);
    }
}
