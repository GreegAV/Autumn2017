package ipanyok.matrix;

public class Matrix {
    private int[][] array;

    Matrix(int indexI, int indexJ) {
        array = new int[indexI][indexJ];
    }

    public int getElement(int indexI, int indexJ) {
        return array[indexI][indexJ];
    }

    public void setElement(int indexI, int indexJ, int elem) {
        array[indexI][indexJ] = elem;
    }

    public int getVerticalSize(){
        return array.length;
    }

    public int getHorizontalSize(){
        return array[0].length;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result = result  + array[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }
}
