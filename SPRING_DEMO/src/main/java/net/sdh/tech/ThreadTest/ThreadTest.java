package net.sdh.tech.ThreadTest;

public class ThreadTest extends Thread {
    public ThreadTest() {
    }

    public ThreadTest(String name) {
        super(name);
    }

    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);
        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i<20; i++){
//            System.out.println("run"+i);
//        }
    }
}
