import java.io.*;

public class FileReaderThread extends Thread {
    private final File file;

    FileReaderThread(File file) {
        this.file = file;
    }

    public void run() {
        int sum = 0, fileLength = (int) this.file.length();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(this.file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (fileLength > 0) {
            try {
                    sum = sum + inputStream.read() - 48;
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileLength--;
        }
        System.out.println(sum);
    }
}
