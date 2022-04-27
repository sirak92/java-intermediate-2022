
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        ArrayList<Pair> pairs = new ArrayList<Pair>();
        File file = new File("newFile1.txt");

        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ) {
            for (int isLine = 0; isLine < MyFunctions.getLinesCount(file); isLine++) {
                String nextLine = bufferedReader.readLine();
                if (!MyFunctions.rightFormat(nextLine)) {
                    throw new InvalidFormatException("Invalid Format");
                } else {
                    Pair pair = new Pair();
                    pairs.add(pair);
                    boolean goingToAddInLetter = true;
                    boolean goingToAddInNumber = false;
                    String numberForPairInString = null;
                    for (int i = 0; i < nextLine.length(); i++) {
                        if (goingToAddInLetter) {
                            if (nextLine.charAt(i) != '-') {
                                pair.letter += String.valueOf(nextLine.charAt(i));
                            }
                        }
                        if (nextLine.charAt(i) == '-') {
                            goingToAddInLetter = false;
                            goingToAddInNumber = true;
                            numberForPairInString = nextLine.substring(i + 1);
                            pair.number = Integer.valueOf(numberForPairInString);
                            break;
                        }
                    }
                }
            }

        } catch (FileNotFoundException | InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyFunctions.showPairs(pairs);
    }
}
