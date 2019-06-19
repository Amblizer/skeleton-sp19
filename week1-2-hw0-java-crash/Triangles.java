/**
 * drawTriangle
 */
public class Triangles {

    /**
     * Generate n number of "*"
     * @param n
     */
    public static void star(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*"); 
        }
        System.out.println();
    }
    
    /**
     * Draw triangle of n lines of "*"
     * @param n
     */
    public static void drawTriangle(int n) {
        for (int i = 1; i < n + 1; i++) {
            star(i);
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }


}