package ipanyok.matrix;

public class Summator {
    public static Matrix sum(Matrix matrixI, Matrix matrixJ) {
        if ((matrixI.getVerticalSize() == matrixJ.getVerticalSize()) && (matrixI.getHorizontalSize() == matrixJ.getHorizontalSize())) {
            Matrix matrix = new Matrix(matrixI.getVerticalSize(), matrixI.getHorizontalSize());
            for (int i = 0; i < matrixI.getVerticalSize(); i++) {
                for (int j = 0; j < matrixI.getHorizontalSize(); j++) {
                    int sum = matrixI.getElement(i, j) + matrixJ.getElement(i, j);
                    matrix.setElement(i, j, sum);
                }
            }
            return matrix;
        } else {
            System.out.println("Matrixies have different size!");
            return null;
        }
    }
}
