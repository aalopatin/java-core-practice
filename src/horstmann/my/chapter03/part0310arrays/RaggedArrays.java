package horstmann.my.chapter03.part0310arrays;

public class RaggedArrays {
    public static void main(String[] args) {

        final int SIZE = 10;
        final int MAXRANDOMNUMBER = 100;

        int[][] ladderArray = new int[SIZE][];

        for (int i = 0; i < ladderArray.length; i++) {
            ladderArray[i] = new int[i+1];
            for (int j = 0; j < ladderArray[i].length; j++) {
                ladderArray[i][j] = j+1;
            }
        }

        Utils.printArray(ladderArray);

        System.out.println();

        int[][] randomRaggedArray = new int[SIZE][];

        for (int i = 0; i < randomRaggedArray.length; i++) {
            randomRaggedArray[i] = new int[(int) (Math.random() * SIZE)];
            for (int j = 0; j < randomRaggedArray[i].length; j++) {
                randomRaggedArray[i][j] = (int) (Math.random() * MAXRANDOMNUMBER);
            }
        }

        Utils.printArray(randomRaggedArray);

    }


}
