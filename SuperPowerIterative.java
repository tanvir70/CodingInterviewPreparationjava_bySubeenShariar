import java.util.Scanner;

public class SuperPowerIterative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Base value : ");
        float base = scan.nextFloat();
        System.out.println("Enter the Power value : ");
        float power = scan.nextFloat();
        float result = 1;

        while (power > 0) {
        // If power is less than zero , then what will be the if logic
            if (power % 2 == 1) {
                result = result * base;
                power -= 1;
            }
                base = base * base;
                power = power / 2;
        }

        System.out.println("Result = " + result);

    }
}
