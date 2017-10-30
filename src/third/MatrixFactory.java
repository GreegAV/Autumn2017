package third;

/**
 * Created by avg-m on 30/10/2017.
 */
public class MatrixFactory {
   /*
   создает матрицу указанного размера и возвращает её
   на вход конструктора получает размерность матрицы


    */
   public static Matrix createMatrix(int horSize, int vertSize){
        int[][] matr=new int[][];
       for (int i = 0; i <horSize ; i++) {
           for (int j = 0; j <vertSize ; j++) {
               matr[i][j]=(int)Math.random()*12;
           }
       }
       return matr;
   }
}
