package tests;

import vehicles.Vehicle;
import java.io.*;

public class tests {
    public static void main(String[] args) {

        Integer numar = 3;
        numar.toString();



        Vehicle vehicul = new Vehicle("automobil", 100, "acesta este un comentariu");
        System.out.println("Tip: " + vehicul.getType() + " Cai putere: " + vehicul.getHorsepower() + " " + vehicul.getComment());


        Vehicle vehicul2 = new Vehicle("moto", 120, "moto puternic");
        System.out.println("Tip: " + vehicul2.getType() + " Cai putere: " + vehicul2.getHorsepower() + " " + vehicul2.getComment());

        System.out.println(Vehicle.marca);
        vehicul.Honk();

        Vehicle vehicul3 = new Vehicle("moto", 120, "moto puternic");
        System.out.println(readFromFile("links.txt"));

    }

    public static String readFromFile(String fileName){
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