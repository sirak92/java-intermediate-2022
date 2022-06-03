package threadstask;

import java.io.File;

public class FileReader {

    public static void fileReader(File... files) {
        if (files.length == 0) {
            return;
        }
        Thread[] threads = threadsInitializer(files);
        runMultipleThreads(threads);
    }

    static Thread[] threadsInitializer(File... files) {
        Thread[] threads = new Thread[files.length];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new RunnableFileReader(files[i]), "Thread" + (i + 1));
        }

        return threads;
    }

    static void runMultipleThreads(Thread... threads) {
        for (Thread thread: threads) {
            thread.start();
        }
    }
}
