import java.io.*;

public class Multithreading1 {
    public static void main(String[] args) throws IOException {
        FileReaderThread fileReaderThread =
                new FileReaderThread(new File("C:\\Users\\M&M\\IdeaProjects\\Tech42\\src\\a"));
        FileReaderThread fileReaderThread1 =
                new FileReaderThread(new File("C:\\Users\\M&M\\IdeaProjects\\Tech42\\src\\b"));
        fileReaderThread.start();
        fileReaderThread1.start();
    }
}
