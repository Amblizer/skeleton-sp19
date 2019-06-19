import java.util.Arrays;

public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */ 
        if (a.length < 1) {
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            }
            for (int j = i + 1; j < i + n + 1 && j < a.length; j++) {
                // System.out.print(String.format("i: %d, j: %d\n", i, j));
                a[i] += a[j];
            }
        }
    }
    for (type var : iterable) {
        
    }
  
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
    
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(Arrays.toString(a));
    }
}