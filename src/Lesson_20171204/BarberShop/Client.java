package Lesson_20171204.BarberShop;

public class Client implements Runnable{

    BarberShop barberShop;

    public Client(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
            barberShop.increaseQuery();
        } catch (InterruptedException e) {
            e.toString();
        }
    }

}