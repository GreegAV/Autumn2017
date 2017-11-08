package les05.Car;

/*
 Создать объект класса Автомобиль, используя класс Колесо. Методы: ехать, заправляться, менять
 колесо, вывести на консоль марку автомобиля.
 */

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку авто : ");
        String carBrand = scanner.nextLine();
        System.out.print("Сколько топлива в баке : ");
        int carTank = scanner.nextInt();
        System.out.print("Введите размер колес : ");
        int wheelRadius = scanner.nextInt();
        System.out.print("Колеса исправны? ");

        boolean wheelsOK=scanner.nextLine().equalsIgnoreCase("yes");

        Car car = new Car(carBrand, carTank, wheelRadius, wheelsOK);

        System.out.println("Создана машина марки " + car);

        if (car.checkStatus()) {
            car.drive();
        }

        System.out.println("А теперь "+car+ " превращается...");
        System.out.print("Введите грузоподъёмность : ");
        int carryLoad=scanner.nextInt();

        Lorry lorry=new Lorry(carBrand,carTank,wheelRadius,wheelsOK,carryLoad);

        System.out.println("Получается "+ lorry);
    }

}
