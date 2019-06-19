import java.util.Arrays;

/**
 * maxNumber
 */
public class maxNumber {

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        if (m.length < 1) {
            System.out.println(m.length);
            return -1;
        }
        
        int res = m[0];
        for (int i = 1; i < m.length; i++) {
            if (res < m[i]) {
                res = m[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(String.format("The max number in %s is %d", Arrays.toString(numbers), max(numbers)));
    }
}