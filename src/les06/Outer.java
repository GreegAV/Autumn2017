package les06;

public class Outer {
    int outer_x=100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println(outer_x);
            test2();
        }
    }

    void test2(){
        System.out.println("Test 2!");
    }
}
