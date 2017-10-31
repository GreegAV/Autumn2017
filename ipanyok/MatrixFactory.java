package ipanyok.matrix;

import java.util.Random;

public class MatrixFactory {
    public static Matrix createMatrix(int indexI, int indexJ){
        Matrix matrix = new Matrix(indexI, indexJ);
        Random rand = new Random();
        for (int i = 0; i < indexI; i++) {
            for (int j = 0; j < indexJ; j++) {
                matrix.setElement(i, j, rand.nextInt(10));
            }
        }
        return matrix;
    }
}
