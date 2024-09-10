import java.util.Scanner;

public class MethodOverloadingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        if (input.contains(" ")) {
            processStringWithSpace(input);
        } else {
            processStringWithoutSpace(input);
        }

        scanner.close();
    }
    public static void processStringWithoutSpace(String str) {
        str = str.replace('A', 'Z');
        System.out.println("Modified String: " + str);
        System.out.println("Length of the string: " + str.length());
    }
    public static void processStringWithSpace(String str) {
        if (str.length() < 10) {
            int mid = str.length() / 2;
            String firstHalf = str.substring(0, mid);
            String secondHalf = "CHARUSAT";
            str = firstHalf + secondHalf;
            System.out.println("Modified String: " + str);
        } else {
            System.out.println("Modified String: " + str.toLowerCase());
        }
    }
}