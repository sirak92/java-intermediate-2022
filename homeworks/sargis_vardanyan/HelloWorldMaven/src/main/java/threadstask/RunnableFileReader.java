package threadstask;

import java.io.*;
import java.io.FileReader;

public class RunnableFileReader implements Runnable {
    private final File inputFile;
    private final String outputFileName;

    public RunnableFileReader(File inputFile) {
        this.inputFile = inputFile;
        this.outputFileName = "Out" + this.inputFile.getName();
    }

    @Override
    public void run() {
        File out = new File(this.inputFile.getParent() + "/" + outputFileName);
        try (BufferedReader inputFile = new BufferedReader(new FileReader(this.inputFile));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter(out))) {
            String currentLine;
            int result = 0;
            while((currentLine = inputFile.readLine()) != null) {
                result += Integer.parseInt(currentLine);
            }
            out.createNewFile();
            outputFile.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
