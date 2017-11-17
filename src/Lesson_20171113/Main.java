package Lesson_20171113;


public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.leftEngine(1);
        airplane.rightEngine(2);
        airplane.startEngines();

        new Plane2().getEngineInnerClass().start();
        new Plane2().getEngineMethodClass().start();
        new Plane2().getEngineAnonymousClass().start();
    }

}
