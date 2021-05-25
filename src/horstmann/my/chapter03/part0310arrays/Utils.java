package horstmann.my.chapter03.part0310arrays;

public class Utils {
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format(" %3d", array[i][j]));
            }
            System.out.println();
        }
    }
}
