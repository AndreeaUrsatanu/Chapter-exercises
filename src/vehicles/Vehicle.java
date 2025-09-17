package vehicles;

/*
O clasa are:
proprietati instanta (ale obiectului);
proprietati de clasa (static);
constructor/constructori
metode
final este folosit pentru constante

Modifier	Same Class	Same Package	Subclass	Other Packages
public	    ✅	        ✅	            ✅	        ✅
protected	✅	        ✅	            ✅	        ❌
default	    ✅	        ✅	            ❌	        ❌
private	    ✅	        ❌	            ❌	        ❌


1. Encapsulation
The practice of hiding internal data and only exposing access through public methods, typically using getters and setters.

2. Inheritance
A mechanism that allows one class to acquire the properties and behaviors (fields and methods) of another class.

3. Polymorphism
The ability of different classes to respond to the same method call in different ways, often through method overriding or overloading.

4. Abstraction
The process of hiding complex implementation details and showing only the essential features of an object.

 */

public class Vehicle {
    public static String marca = "Dacia";
    private String type;
    private int horsepower;
    private String comment;
    private int power;

    static int count = 0;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Vehicle(String type, int horsepower, String comment){
        this.type = type;
        this.horsepower = horsepower;
        this.comment = comment;
        count++;
    }

    private int transformHorsepowerToKW(int horsepower){
        return horsepower * 200;
    }

    public void Honk(){
        System.out.println(this.type + " " + marca + "care are " + transformHorsepowerToKW(horsepower) + "kilowatts a claxonat!");
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}