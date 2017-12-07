package Lesson_20171204.BarberShop;

import java.util.LinkedList;

public class BarberShop {
    boolean served = false;
    int freeSeats;
    LinkedList<Thread> waitingList = new LinkedList<Thread>() {};

    private BarberShop(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    public synchronized void checkClient() throws InterruptedException{
        while(waitingList.size()<1){
            System.out.println("Барбер вейпит :)");
            wait();
        }
        servingClient();
    }
    public synchronized void servingClient() throws InterruptedException {
        served = true;
        notify();
        System.out.println("Обслуживается "+  waitingList.getFirst().getName());
        waitingList.removeFirst();
        checkClient();
    }

    public synchronized void increaseQuery() throws InterruptedException {
        if(waitingList.size()< freeSeats){
            if(waitingList.size()<1){
                System.out.print(Thread.currentThread().getName()+" отвлёк парикмахера. ");
                notifyAll();
            }
//            System.out.println(Thread.currentThread().getName()+
//                    " ждет обслуживания.");
            waitingList.add(Thread.currentThread());
            while(!served){
                wait();
            }
        }else{
            System.out.println("Барбершоп занят, клиент "
                    +Thread.currentThread().getName()+" ушел.");
        }
    }
    
    public static void main(String[] args) {
        int freeSeats = 4;
        LinkedList<Thread> clients = new LinkedList<Thread>() {};
        BarberShop barberShop = new BarberShop(freeSeats);
        Thread barber = new Thread(new Barber(barberShop), "БарберМен");
        barber.start();

        for(int i=0; i<10; i++){
            clients.add(new Thread(new Client(barberShop),"Клиент "+i));
        }
        for (int i = 0; i < 10; i++) {
            clients.get(i).start();
        }
//        System.exit(0);
    }

}