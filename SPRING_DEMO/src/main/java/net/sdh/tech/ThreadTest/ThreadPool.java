package net.sdh.tech.ThreadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new ThreadPoolRun());
        es.submit(new ThreadPoolRun());
        es.submit(new ThreadPoolRun());
        es.submit(new ThreadPoolRun());
    }
}
