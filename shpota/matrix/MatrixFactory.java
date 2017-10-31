package com.shpota.matrix;

public class MatrixFactory {
    public static Matrix createMatrix(int vertical, int horizontal) {
        return new Matrix(vertical, horizontal);
    }
}
