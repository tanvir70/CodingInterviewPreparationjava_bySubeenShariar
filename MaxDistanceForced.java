public class MaxDistanceForced {

    public static void main(String[] args) {

        int[] arry = {3, 5, 4, 2,1,5,1,2,3};
        int maxDistance = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 1; j < arry.length; j++) {

                if (arry[i] <= arry[j])
                    if (j - i > maxDistance)
                        maxDistance = j - i;
            }
        }
        System.out.println("MAX distance = " + maxDistance);
    }
}