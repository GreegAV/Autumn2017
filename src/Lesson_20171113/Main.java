package Lesson_20171113;


public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        System.out.println("Создание левого двигателя.");
        airplane.leftEngine(1);
        System.out.println("Сщздание правого двигателя. ");
        airplane.rightEngine(2);
        System.out.println("Запуск двигателей.");
        airplane.startEngines();

        System.out.println("Другой самолет.");
        new Plane2().getEngineInnerClass().start();
        new Plane2().getEngineMethodClass().start();
        new Plane2().getEngineAnonymousClass().start();
    }

}
