import java.io.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(readFromFile("links.txt"));

        System.out.println(Vehicle.count);
        Vehicle vehicul = new Vehicle("automobil", 100, "acesta este un comentariu la initializare");
        System.out.println("Tip: " + vehicul.type + " Cai putere: " + vehicul.horsepower + " " + vehicul.comment);
        Vehicle.sum();

        Vehicle vehicul2 = new Vehicle("moto", 120, "moto puternic");
        System.out.println("Tip: " + vehicul2.type + " Cai putere: " + vehicul2.horsepower + " " + vehicul2.comment);
        Vehicle.sum();
        System.out.println(Vehicle.marca);

        Vehicle vehicul3 = new Vehicle("moto", 120, "moto puternic", "rosu");

        vehicul.Honk();



        /*
        vehicul = {
            type: "automobil";
            horsePower: 100;
        }
         */



    }


    public static String readFromFile(String fileName) {
        File file = new File(fileName);
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