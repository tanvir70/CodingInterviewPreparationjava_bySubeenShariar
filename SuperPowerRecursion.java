public class SuperPowerRecursion {
    public static void main(String[] args) {
        float result = 0;
        result =  myPow(2,8);

        System.out.println(result);

    }

    public static float myPow(float base, int pow){
        if (pow == 0)
            return 1;
        if (pow < 0)
            return 1 / myPow(base, -pow);
        if(pow % 2 == 1)
            return base * myPow(base , pow -1);
        float value = myPow(base,pow / 2);
        return value * value;

    }
}
