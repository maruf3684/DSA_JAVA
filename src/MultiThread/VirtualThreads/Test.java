package MultiThread.VirtualThreads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with JVTs
        ExecutorService executor = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        // Use JVTs to perform tasks concurrently
        IntStream.range(0, 10)
                .forEach(i -> executor.submit(() -> {
                    System.out.println("Task " + i + " started by thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + i + " completed by thread: " + Thread.currentThread().getName());
                }));

        // Shutdown the executor
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}