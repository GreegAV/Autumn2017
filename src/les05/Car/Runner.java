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
        int carTank = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите размер колес : ");
        int wheelRadius = Integer.parseInt(scanner.nextLine());
        if (wheelRadius > 22) {
            System.out.println("BigFoot? :)");
        } else if ((wheelRadius < 10) && (wheelRadius > 0)) {
            System.out.println("Stroller? :)");
        }
        System.out.print("Колеса исправны? ");
        String wheelsStatus = scanner.nextLine();
        boolean wheelsOK = wheelsStatus.equalsIgnoreCase("yes");

        Car car = new Car(carBrand, carTank, wheelRadius, wheelsOK);

        System.out.println("Создана машина марки " + car);

        if (car.checkStatus()) {
            car.drive();
        }

        System.out.println("А теперь " + car + " превращается...");
        System.out.print("Введите грузоподъёмность : ");
        int carryLoad = scanner.nextInt();

        Lorry lorry = new Lorry(carBrand, carTank, wheelRadius, true, carryLoad);

        System.out.println("Получается " + lorry);
    }

}
