
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class MyFunctions {
    static boolean containsOnlyNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= '0' || str.charAt(i) >= '9') {
                return false;
            }
        }
        return true;
    }

    static boolean rightFormat(String nextLine) {
        if (nextLine.length() < 3) {
            return false;
        }
        if (!nextLine.contains("-")) {
            return false;
        }
        int next = 0;
        while (nextLine.charAt(next) != '-') {
            if (nextLine.charAt(next) < 64 || nextLine.charAt(next) > 122 ||
                    (nextLine.charAt(next) > 90 && nextLine.charAt(next) < 97)) {
                return false;
            }
            next++;
        }
        String spaceForNumbers = nextLine.substring(++next);
        if (!containsOnlyNumbers(spaceForNumbers)) {
            return false;
        }
        return true;
    }

    public static int getLinesCount(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int linesCount = 0;
        String nextLine = bufferedReader.readLine();
        while (nextLine != null) {
            nextLine = bufferedReader.readLine();
            linesCount += 1;
        }
        return linesCount;
    }

    public static void showPairs(ArrayList<Pair> pairs){
        for (Pair pair: pairs){
            System.out.println(pair.letter +" "+pair.number);
        }
    }
}

