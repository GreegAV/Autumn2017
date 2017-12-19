package Training;

interface InterfaceB{
    int x = 3;
    int myMethod();
}

interface InterfaceA extends InterfaceB{
    int x=7;
}

public class MyClass implements InterfaceA{
    int x=5;
    public int myMethod(){
        return x;
    }

    public static void main(String[] args) {
        InterfaceA infA = new MyClass();
        InterfaceB infB = new MyClass();
        MyClass mc = new MyClass();
        System.out.print(mc.x);
        System.out.print(infA.x);
        System.out.print(infB.x);
        System.out.print(mc.myMethod());
        System.out.print(infA.myMethod());
        System.out.print(infB.myMethod());
    }
}
