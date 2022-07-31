public class KadanesAlgorithm {

    public static void main(String[] args) {

        int[] array = {-5, 4, 6, -3, 4, -1};

        int maxSum = -1000000;
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {

            currentSum = currentSum + array[i];

            if ( currentSum > maxSum)
                maxSum = currentSum;

            if (currentSum < 0)
                currentSum = 0;

        }

        System.out.println("Largest sum of contiguous subarray = " + maxSum);

    }

}
