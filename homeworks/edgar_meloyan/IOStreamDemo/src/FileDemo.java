import java.io.*;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Test.txt");
        if (f1.createNewFile()) {
            System.out.println("Test.pdf file has been created");
        } else {
            System.out.println("File with the same name already exists");
        }
        String source = """
                a 1
                b 2
                b 3
                b 4
                """;

        byte[] buf = source.getBytes();
        FileOutputStream f = null;

        try {
            f = new FileOutputStream("Test.txt");
            f.write(buf);
        } catch (IOException e) {
            System.out.println("An I/o error has occurred");
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file Test.pdf");
            }
        }

        BufferedReader reader = new BufferedReader(new FileReader("Test.txt"));
        ArrayList<String> items = new ArrayList<>();
        String line;

        try (reader) {
            while ((line = reader.readLine()) != null) {
                items.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Test.txt not found");
        } catch (IOException e) {
            System.out.println("Error reading file Test.txt");

            try {
                reader.close();
            } catch (IOException t) {
                System.out.println("Error closing file Test.txt");
            }
        }
        String[] itemsToArray = items.toArray(new String[0]);
        System.out.println(Arrays.toString(itemsToArray));
    }
}
