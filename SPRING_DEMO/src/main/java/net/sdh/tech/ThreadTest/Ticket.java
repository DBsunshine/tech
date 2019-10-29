package net.sdh.tech.ThreadTest;

public class Ticket extends Thread {
    private int ticket = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (obj) {

//            }
            countTicket();
        }
    }

    public synchronized void countTicket(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在读取" + ticket + "张票");
            ticket--;
        }
    }
}
