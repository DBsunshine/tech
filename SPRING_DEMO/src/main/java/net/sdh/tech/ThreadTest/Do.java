package net.sdh.tech.ThreadTest;

public class Do {
    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        tt.setName("001");
        tt.start();
        new ThreadTest("002").start();
        for (int i = 0; i<5; i++){
            System.out.println("main"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
