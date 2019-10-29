package net.sdh.tech.ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketLock extends Thread {
    private int ticket = 100;

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在读取" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                }
                l.unlock();
            }
//            l.unlock();
        }
    }
}
