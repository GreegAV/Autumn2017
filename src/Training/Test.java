package les07;

/**
 * Created by avg-m on 13/11/2017.
 */
public class Test {

    public static int arraylength(int[] myArray){
        int tmp;
        for (int i = 0; ; i++) {
            try {
                tmp=myArray[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(arraylength(arr));

    }


}
