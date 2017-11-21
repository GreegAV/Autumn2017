package Training;

public class PSkills {
        public static void main(String args[]) {
            test1();
            test2();

            }

    private static void test2() {
        int i,j,k;

        for (i = 0; i < 3; i++) {
            for(j=1; j < 4; j++) {
                for(k=2; k<5; k++) {
                    boolean a=(i==j);
                    boolean b=(j==k);
                    if(a && b)
                        System.out.println(i);
                }
            }
        }
    }


    private static void test1() {
        int i,j,k,l=0;
        k = l++;
        j = ++k;
        i = j++;
       // System.out.println(i);
    }
}
