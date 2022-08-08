import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a key to find : ");
        int key = scan.nextInt();

        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while (left <= right){

            mid = ((left + right) / 2);
            if ( array[mid] == key) {
                System.out.println("Your key is in " + mid + "th index");
                break;
            }
            else if (array[mid] > key) {
                left = mid + 1;
            }
            else
                right = mid - 1;

        }

    }
}
