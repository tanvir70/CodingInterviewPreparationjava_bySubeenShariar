import java.util.Arrays;
import java.util.Scanner;

public class RotatedArraySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What the length of the array : ");
        int n = scan.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(array));
        int left = 0;
        int right = n - 1;
        int mid = 0;
        System.out.print("Enter a Targeted key : ");
        int key = scan.nextInt();
        while (left <= right){
            mid = (left + right) / 2;
            if (array[mid] == key) {
                System.out.println("Key is in " + mid "th index");
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
