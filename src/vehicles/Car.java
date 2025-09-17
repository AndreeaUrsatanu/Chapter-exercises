package vehicles;

public class Car {

    Vehicle vehicle = new Vehicle("moto", 120, "moto puternic");

    public void printCarDetails(){
        System.out.println("Tip: " + vehicle.getType() + " Cai putere: " + vehicle.getHorsepower() + " " + vehicle.getComment());
    }
}