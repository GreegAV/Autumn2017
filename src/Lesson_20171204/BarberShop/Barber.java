package Lesson_20171204.BarberShop;

public class Barber implements Runnable{
    BarberShop barberShop;

    public Barber(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
            barberShop.checkClient();
        } catch (InterruptedException e) {
            e.toString();
        }
    }

}