package net.sdh.tech.ThreadTest;

public class ThreadPoolRun implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
