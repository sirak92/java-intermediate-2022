package file;

import java.io.*;

public class CopyWithStreams {
    public static void main(String[] args) throws IOException {

        try (FileReader in = new FileReader("C:\\Users\\working PC\\IdeaProjects\\FirstProject\\src\\file\\a");
             FileWriter out = new FileWriter("C:\\Users\\working PC\\IdeaProjects\\FirstProject\\src\\file\\b")) {
            int s;
            while ((s = in.read()) != -1) {
                out.write(s);
            }
        }
    }
}

