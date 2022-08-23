import java.util.Scanner;
//This code in written in linear searching way. It can be done with binary search too ...
public class SearchForRangeLinear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {5, 7, 8, 8, 10,8};

        System.out.print("Enter a target : ");
        int target = scan.nextInt();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                System.out.println("First Position is : " + i);
                break;
            }
            //else
                //System.out.println("First Position is : -1");

        }

        for (int j = nums.length - 1; 0 < j; j--) {
            if (nums[j] == target) {
                System.out.println("Second Position is : " + j);
                break;
            }
            //else
               // System.out.println("Second Position is : -1");

        }

    }
}
