public class Power {
    public static int pow(int num, int x) {

        //the base case
        if (x == 1) return num;


        if (x % 2 == 0) {
            int k1 = pow(num, x / 2);
            return k1 * k1;
        } else {
            int k1 = pow(num, (x - 1) / 2);
            return k1 * k1 * num;
        }

    }
}
