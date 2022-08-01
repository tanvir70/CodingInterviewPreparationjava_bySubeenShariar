import java.util.Scanner;

public class IntegerReplacement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = scan.nextInt();

        System.out.println(replacer(n));

    }

    public static int replacer(int n){

        if ( n == 1)
            return 0;
        if ( n == 2)
            return 1;
        if ( n % 2 == 0) {
            return 1 + replacer(n / 2);
        }
        else{

            if (n == Integer.MAX_VALUE){
                return 1 + Math.min(replacer(n-1),replacer(n/2));
            }else{
                return 1 + Math.min(replacer(n-1),replacer(n+1));
            }
        }


    }

}
