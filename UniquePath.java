public class UniquePath {
// not Complete
    public static int uPath(int m, int n){

        if ( m == 1 || n == 1)
            return 1;

        return uPath(m - 1, n) + uPath(m,n - 1);

    }

    public static void main(String[] args) {
        System.out.println(uPath(3,7));
    }

}
