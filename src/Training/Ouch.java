package les06;

/**
 * Created by avg-m on 06/11/2017.
 */
public class Ouch{
    static int ouch=7;

    public static void main(String[] args) {
        new Ouch().go(ouch);
        System.out.println(" "+ ouch);

    }
    void go (int ouch){
        ouch++;

        for (  ouch = 3; ouch <6; ouch++)
            ;
        System.out.println(" "+ ouch);
    }
}

