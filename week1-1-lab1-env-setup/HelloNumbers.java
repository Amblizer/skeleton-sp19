public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int n = 1;
        while (x < 46) {
            System.out.print(x + " ");
            x = x + n;
            n = n + 1;
        }
        System.out.println();
    }
}