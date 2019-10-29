package net.sdh.tech.ThreadTest;

public class RunnableTest {
    public static void main(String[] args) {
        RunnableImpl rt = new RunnableImpl();
        Thread run = new Thread(rt);
        run.start();
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"i");
        }
    }
}
