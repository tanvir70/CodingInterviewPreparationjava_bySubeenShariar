import java.util.Scanner;

public class StringMatching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string where u want to search : ");
        String haystack = scan.nextLine();
        System.out.print("Enter what to search : ");
        String needle = scan.nextLine();

        int result = haystack.indexOf(needle);

        System.out.println("Result : " + result);

    }
}
