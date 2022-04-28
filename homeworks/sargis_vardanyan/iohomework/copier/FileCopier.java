package copier;

import java.io.*;

public class FileCopier {
    public enum State {APPEND, APPEND_WITH_SPACE, APPEND_IN_NEW_LINE, ALTER_AND_APPEND}


    public static void copy(String arg1, String arg2, FileCopier.State state) throws IOException {
        if (!isValid(arg1, arg2)) {
            throw new IOException(new FileNotValidException("Commandline arg is not required:"));
        }
        copy(new File(arg1), new File(arg2), state);
    }

    public static void copy(File file1, File file2, FileCopier.State state) throws IOException {
        switch (state) {
            case ALTER_AND_APPEND -> alterAndAppend(file1, file2);
            case APPEND_IN_NEW_LINE -> appendInNewLine(file1, file2);
            case APPEND_WITH_SPACE -> appendWithSpace(file1, file2);
            case APPEND -> append(file1, file2);
        }
    }

    private static void append(File file1, File file2) throws IOException {
        try (
                FileReader first = new FileReader(file1);
                FileWriter second = new FileWriter(file2, true)
        ) {
            int i;
            while ((i = first.read()) != -1) {
                second.append((char) i);
            }
        }
    }

    private static void appendWithSpace(File file1, File file2) throws IOException {
        try (
                FileReader first = new FileReader(file1);
                FileWriter second = new FileWriter(file2, true)
        ) {
            int i;
            second.append(" ");
            while ((i = first.read()) != -1) {
                second.append((char) i);
            }
        }
    }

    private static void alterAndAppend(File file1, File file2) throws IOException {
        try (
                FileReader first = new FileReader(file1);
                FileWriter second = new FileWriter(file2)
        ) {
            int i;
            while ((i = first.read()) != -1) {
                second.append((char) i);
            }
        }
    }

    private static void appendInNewLine(File file1, File file2) throws IOException {
        try (
                FileReader first = new FileReader(file1);
                FileWriter second = new FileWriter(file2, true)
        ) {
            int i;
            second.append("\n");
            while ((i = first.read()) != -1) {
                second.append((char) i);
            }
        }
    }

    private static boolean isValid(String arg1, String arg2) {
        return new File(arg1).isFile() && new File(arg2).isFile();
    }
}
