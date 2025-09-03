import java.io.*;

public class Exercise {
    public static void main(String[] args) {
        createFile("exercise.txt");
        writeToFile("exercise.txt", "Andreea");
        System.out.println(readFromFile("exercise.txt"));
    }

    public static boolean createFile(String fileName) {
        File file = new File(fileName);

        try {
            if (file.exists()) {
                System.out.println("The file already exists: " + fileName);
                return false;
            } else {
                if (file.createNewFile()) {
                    System.out.println("The file was created: " + fileName);
                    return true;
                } else {
                    System.out.println("Failed");
                    return false;
                }
            }
        } catch (IOException e) {
            System.out.println("I/O exception");
            return false;
        }
    }

    public static boolean writeToFile(String fileName, String content) {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("The file does not exist: " + fileName);
            return false;
//            Exercises.createFile(fileName);
        }

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(System.lineSeparator() + content);
            fileWriter.close();
            System.out.println("The content was written: " + content);
            return true;
        } catch (IOException e) {
            System.out.println("I/O exception");
            return false;
        }
    }

    public static String readFromFile(String fileName) {
        File file = new File(fileName);
        StringBuilder outputString = new StringBuilder();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                outputString.append(line).append(System.lineSeparator());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }

        return outputString.toString();
        //return outputString.toString().trim();

    }
}
