import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] num = new int[0];

        int i = 0;
        int n = num.length;
        for (int j = 1; j < n; j++) {

            if (num[j] == num[i]) {
                continue;
            }
              else {
                i += 1;
                num[i] = num[j];
            }
        }
        System.out.println(Arrays.toString(num));
    }

}
