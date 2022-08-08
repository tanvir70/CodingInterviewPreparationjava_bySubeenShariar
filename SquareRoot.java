import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a key to find Square Root : ");
        int key = scan.nextInt();
        int left = 0;
        int right;
        right = key;
        int mid = 0;

        while (left <= right){

            mid = ((left + right) / 2);


            if ( mid * mid <= key && ((mid + 1) * (mid +1 )) > key ) {
                System.out.println("Square Root of " + key + " is : " + mid);
                break;
            }
            else if (mid * mid > key){
                right = mid -1;
            }
            else
                left = mid + 1;

        }

    }

}
