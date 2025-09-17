import java.io.*;

public class FileOperations {
    String fileName = "";
    public FileOperations(String filename){
        this.fileName = filename;
    }

    public String readFromFile(){
        File file = new File(this.fileName);
        String outputString = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            outputString = bufferedReader.readLine();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
        return outputString;
    }
}