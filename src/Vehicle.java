/*
O clasa are:
- proprietati de instanta (ale obiectului)
- proprietati de clasa (static)
- constructor/constructori
- metode
- final este folosit pentru cinstante
 */

public class Vehicle {
    static String marca = "Dacia";
    String type;
    int horsepower;
    String comment;

    static int count = 0;

    public Vehicle(String type, int horsePower, String comment) {
        this.type = type;
        this.horsepower = horsePower;
        this.comment = comment;

        count++;
    }

    public Vehicle(String type, int horsePower, String comment, String color) {
        this.type = type;
        this.horsepower = horsePower;
        this.comment = comment;

        count++;
    }

    public void Honk() {
        marca = "Renault";
        System.out.println(this.type + " " + marca + " a claxonat");
    }

    static void sum() {
        System.out.println(count);
    }
}
