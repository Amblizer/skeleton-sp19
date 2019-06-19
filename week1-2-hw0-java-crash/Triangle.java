/** hw0 - 1a: drawing a triangle
 * triangle
 */
public class triangle {
    /**
     * Generate n number of "*"
     * @param n
     */
    private static void star(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*"); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            star(i);
        }
    }
    
}