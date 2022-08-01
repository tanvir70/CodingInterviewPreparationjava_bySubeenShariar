import java.lang.reflect.Array;
import java.util.Arrays;

public class HotelBookingPossible {

    public static void main(String[] args) {

        int[] arrive = new int[]{0, 0, 1, 2, 4, 6, 10, 11, 11, 15, 16, 16, 17, 17, 17, 23, 24, 25, 27, 29, 37, 39, 39, 41, 42, 42, 42, 43, 45};
        int[] depart = {9, 9, 10, 12, 19, 24, 25, 25, 26, 32, 43, 45, 46, 46, 48, 49, 50, 51, 51, 51, 52, 55, 57, 58, 62, 65, 66, 69, 87};
        int roomCount = 16;

       //Though it is already sorted but Description said to solve it in "n log n".
        Arrays.sort(arrive);
        Arrays.sort(depart); 

        int i = 0;
        int j = 0;
        int count = 0;
        // Both arrays will be same length.Person arrive first. So taking arrive array's length is logical.//
        while( i < arrive.length && j < arrive.length){
            if (arrive[i] < depart[j]) {
                count += 1;
                i++;
            }
            else if (depart[j] < arrive[i] ) {
                count -= 1;
                j++;
            }
            else {
                i++;
                j++;
            }

            }
        if (count > roomCount)
            System.out.println("Room is not Available / not Possible ");
        else
            System.out.println("Room is Available / Possible");

        }


    }


