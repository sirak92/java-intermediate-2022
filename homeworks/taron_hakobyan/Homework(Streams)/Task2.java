import java.io.*;

public class Task2 {

    public static void main(String[] args) {
        File file1 = new File("newFile.txt");
        File file2 = new File("newFile2.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))
        ) {
            String nextLine = bufferedReader.readLine();
            bufferedWriter.write(nextLine);
            while (nextLine != null) {
                bufferedWriter.write(nextLine+'\n');

                nextLine = bufferedReader.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}