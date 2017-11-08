package les05.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Car implements Auto {
    private String model;
    private int tank;
    private ArrayList<Wheel> wheels = new ArrayList<>();
    private boolean driving;

    public Car(String model, int tank, int wheelRadius, boolean wheelsOK) {
        this.model = model;
        if (tank > 50) {
            System.out.println("Столько топлива в бак не влезет. Просто заполняю до полного. ");
            tank = 50;
        }
        this.tank = (tank > 0) ? tank : 0;
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel(wheelRadius, wheelsOK));
        }
        this.driving = false;
    }

    public boolean isOkWheels() {
        for (Wheel wheel : wheels) {
            if (!wheel.isOkStatus()) return false;
        }
        return true;
    }

    public void drive() {
        if (isDriving()) {
            System.out.println("И так уже едем :)");
        } else {
            System.out.println("Поехали!");
            this.driving = true;
        }
    }

    public boolean isDriving() {
        return this.driving;
    }

    public void fillCar(int fillLiters) {
        if ((50 - this.tank) < fillLiters) {
            System.out.println("В бак столько не влезет. Заливаю до полного.");
            this.tank = 50;
        } else {
            this.tank += fillLiters;
        }
    }

    boolean hasFuel() {
        return !(this.tank < 10);
    }

    public void changeWheel() {
        System.out.println("Проверяем и меняем колеса");
        for (int i = 0; i < wheels.size(); i++) {
            Wheel wheel = wheels.get(0);
            wheels.remove(0);
            wheel.setOkStatus(true);
            wheels.add(wheel);
        }
    }

    public String modelCar() {
        return this.model;
    }

    public boolean checkStatus() {
        if (this.hasFuel()) {
            System.out.println("Топлива достаточно.");
        } else {
            System.out.println("С таким запасом топлива далеко не уехать. Сколько залить топлива?");

            this.fillCar(new Scanner(System.in).nextInt());
        }

        if (!this.isOkWheels()) {
            System.out.println("На таких колесах далеко не уедешь");
            this.changeWheel();
        }
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return this.modelCar().equals(car.modelCar());
    }

    @Override
    public int hashCode() {
        return this.tank;
    }

    @Override
    public String toString() {
        return this.modelCar();
    }
}
