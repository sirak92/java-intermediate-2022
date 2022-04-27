package pairs;

import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class CustomReader {

    private static final String EMPTY_LINE = "";

    public static List<Pair> pairsOf(File file) throws IOException {
        List<Pair> pairs = null;
        try (BufferedReader inputFile = new BufferedReader(new FileReader(file))) {
            pairs = new ArrayList<>();
            String currentLine;
            while ((currentLine = inputFile.readLine()) != null) {
                if (currentLine.equals(EMPTY_LINE)) {
                    continue;
                }
                String[] current = currentLine.split("-");
                pairs.add(converter(current));
            }
        } catch (IllegalDataFormatException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return pairs;
    }

    private static Pair converter(String[] toCheck) {
        if (toCheck.length != 2) {
            throw new IllegalDataFormatException("Illegal count of '-'");
        }
        String first = toCheck[0].trim();
        String second = toCheck[1].trim();

        return isValidate(first, second) ? new Pair(first.charAt(0), Integer.parseInt(second)) : null;
    }

    private static boolean isValidate(String first, String second) {
        if (!isLetter(first)) {
            throw new IllegalDataFormatException("'" + first + "' is not a letter");
        }
        if (!isNumber(second)) {
            throw new IllegalDataFormatException("'" + second + "' is not a number");
        }

        return true;
    }

    private static boolean isLetter(String s) {
        if (s.length() != 1) {
            return false;
        }
        char c = s.toCharArray()[0];
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

