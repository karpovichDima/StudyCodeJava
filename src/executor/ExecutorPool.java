package executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new MyRunable());
        try {
            System.out.println(executorService.submit(new MyCallable()).get());
        } catch (InterruptedException e) {
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    static class   MyRunable implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}

