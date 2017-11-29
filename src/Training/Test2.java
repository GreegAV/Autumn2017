package Training;

import java.util.*;

/**
 * Created by avg-m on 29/11/2017.
 */
public class Test2 {
    public static void main(String[] args) {
        LinkedList linkedList  = new LinkedList();
        ArrayList arrayList  = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i <100 ; i++) {
            arrayList.add(
                    (100+i)>150?(100+i):(200+i)
            );
        }
        System.out.println(arrayList.lastIndexOf(151));
        System.out.println(arrayList.get(arrayList.lastIndexOf(151)));
        System.out.println(arrayList.toString());
    }
}
