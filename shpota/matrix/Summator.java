package com.shpota.matrix;

public class Summator {
    public static Matrix sum(Matrix a, Matrix b) {
        int verticalSize = a.getVerticalSize();
        int horizontalSize = a.getHorizontalSize();
        Matrix sumMatrix = new Matrix(verticalSize, horizontalSize);
        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSize; j++) {
                int element = a.getElement(i, j) + b.getElement(i, j);
                sumMatrix.setElement(i, j, element);
            }
        }
        return sumMatrix;
    }
}
