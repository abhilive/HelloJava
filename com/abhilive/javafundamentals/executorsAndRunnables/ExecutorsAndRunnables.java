package com.abhilive.javafundamentals.executorsAndRunnables;

import java.sql.Time;
import java.util.concurrent.*;

public class ExecutorsAndRunnables {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Runnable task = () -> System.out.println("I'm in thread: "+ Thread.currentThread().getName());

//        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(4);

        for(int i=0; i < 10; i++) {
//            new Thread(task).start();
            service.execute(task);
        }
        service.shutdown();

        callWithException();
    }

    private static void callWithException()  throws ExecutionException, InterruptedException, TimeoutException {
        Callable<String> task = () -> {
//            Thread.sleep(300);
//            return "I am in Thread " + Thread.currentThread().getName();
            throw new IllegalStateException("I throw an Exception in Thread "+ Thread.currentThread().getName());
        };

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
            for(int i=0; i<10; i++) {
                Future<String> future = executorService.submit(task);
                System.out.println("I get: "+ future.get(100, TimeUnit.MILLISECONDS));
            }
        } finally {
            executorService.shutdown();
        }

    }
}
