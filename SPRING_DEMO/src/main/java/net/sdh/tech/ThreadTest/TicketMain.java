package net.sdh.tech.ThreadTest;

public class TicketMain {
    public static void main(String[] args) {
        Ticket ti = new Ticket();
        Thread t1 = new Thread(ti);
        Thread t2 = new Thread(ti);
        Thread t3 = new Thread(ti);
        t1.start();
        t2.start();
        t3.start();
    }
}
