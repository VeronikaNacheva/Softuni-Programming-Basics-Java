public class P01_RectangleOf10x10Stars {
    public static void main(String[] args) {

        int countRow = 10;
        int countCol = 10;

        for (int row = 1; row <= countRow; row++) {
            for (int col = 1; col <= countCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
