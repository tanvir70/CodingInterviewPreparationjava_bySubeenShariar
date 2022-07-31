public class ContiguousSubArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, -2, 3, 4};

        int maxSum = -100000;
        int currentSum = 0;

        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < array.length; j++) {
                currentSum = 0;
                for(int k = i; k <= j; k++) {
                    System.out.print(array[k]);

                    currentSum = currentSum + array[k];

                    if (currentSum > maxSum)
                        maxSum = currentSum;

                    if (k==j)
                        continue;
                    else
                        System.out.print(",");
                }
                System.out.println();
            }
        }
        System.out.println("Maxsum = " + maxSum);
    }
}
