package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Pair {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\working PC\\IdeaProjects\\FirstProject\\src\\file\\atq"));
        String text = new String(bytes);
        String[] pairs = text.split("\\s+");
        for (int i = 0; i < pairs.length; i++) {
            hashMap.put(pairs[i++], Integer.parseInt(pairs[i]));
        }
        System.out.println(hashMap);

    }
}
