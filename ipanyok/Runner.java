package ipanyok.matrix;

public class Runner {
    public static void main(String[] args) {
        int indexI = 3;
        int indexJ = 5;
        System.out.println("MatrixI:");
        Matrix matrixI = MatrixFactory.createMatrix(indexI,indexJ);
        System.out.println(matrixI.toString());
        System.out.println("MatrixJ:");
        Matrix matrixJ = MatrixFactory.createMatrix(indexI,indexJ);
        System.out.println(matrixJ.toString());
        System.out.println("Get vertical size: " + matrixI.getVerticalSize());
        System.out.println("Get horizontal size: " + matrixI.getHorizontalSize());
        System.out.println("Get elem: " + matrixI.getElement(1,2));
        matrixI.setElement(1,1, 55);
        System.out.println(matrixI.toString());
        Matrix sumMatrix = Summator.sum(matrixI, matrixJ);
        if (sumMatrix != null) {
            System.out.println("Sum: ");
            System.out.println(sumMatrix.toString());
        }
    }
}
