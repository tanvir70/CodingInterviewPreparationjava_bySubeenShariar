import java.util.Scanner;

public class RotatedArraySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {4, 5, 6, 0, 1, 2, 3};
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        System.out.print("Enter a Targeted key : ");
        int key = scan.nextInt();
        while (left <= right){
            mid = (left + right) / 2;
            if (array[mid] == key) {
                System.out.println(mid);
            }
            if (array[left] < array[mid] && key >= array[left] && key < array[mid])
                right = mid - 1;
            else if (array[mid] > array[right] && key > array[mid] && key <= array[right])
                left = mid + 1;
            else if (array[left] > array[right]) {
              right = mid - 1;
           }
            else
                left = mid + 1;

        }

    }

}
