package Labs.Lab6;

import java.io.File;
import java.util.Stack;

public class FileSearch {
    public static void main(String[] args) {
        //System.out.println(searchFiles(new File("c:\\"), "hw3.zip"));
        System.out.println(recursiveSearch(new File("c:\\"), "hw3.zip"));
    }

    public static String searchFiles(File path, String target) {
        Stack<File> stack = new Stack<>();
        stack.push(path);

        while (!stack.isEmpty()) {
            File directory = stack.pop();

            File[] files = directory.listFiles();

            for (File file : files) {
                if (file.isDirectory()) {
                    stack.push(file);
                } else {
                    if (file.getName().equals(target)) {
                        return file.getAbsolutePath();
                    }
                }
            }
        }

        return "File not found.";
    }

    public static String recursiveSearch(File path, String target) {
        if (path == null || !path.isDirectory()) {
            return "Not found";
        }

        File[] files = path.listFiles();
        if (files == null) {
            return "Not found";
        }

        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().equals(target)) {
                    return file.getAbsolutePath();
                }
            } else if (file.isDirectory()) {
                String result = recursiveSearch(file, target);
                if (!result.equals("Not found")) {
                    return result;
                }
            }
        }

        return "Not found";
    }
}
