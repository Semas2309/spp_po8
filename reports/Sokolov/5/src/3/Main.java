import java.util.*;

interface Vehicle {
    String getNumber();
    String getDestination();
    String getDepartureTime();
}

abstract class Person {
    abstract String getName();
    abstract String getDestination();
    abstract String getDepartureTime();
}

class Train implements Vehicle {
    String number;
    String destination;
    String departureTime;
    double price;

    public Train(String number, String destination, String departureTime, double price) {
        this.number = number;
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;
    }

    public String getNumber() { return number; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
}

class Passenger extends Person {
    String name;
    String destination;
    String departureTime;

    public Passenger(String name, String destination, String departureTime) {
        this.name = name;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getName() { return name; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
}

class RailwayTicketSystem {
    List<Vehicle> vehicles = new ArrayList<>();
    List<Person> people = new ArrayList<>();

    public void addTrain(String number, String destination, String departureTime, double price) {
        vehicles.add(new Train(number, destination, departureTime, price));
    }

    public void addPassenger(String name, String destination, String departureTime) {
        people.add(new Passenger(name, destination, departureTime));
    }

    public Vehicle searchVehicle(String destination, String departureTime) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getDestination().equals(destination) && vehicle.getDepartureTime().equals(departureTime)) {
                return vehicle;
            }
        }
        return null;
    }

    public void printInvoice(Person person, Vehicle vehicle) {
        System.out.println("Invoice for " + person.getName());
        System.out.println("Vehicle Number: " + vehicle.getNumber());
        System.out.println("Destination: " + vehicle.getDestination());
        System.out.println("Departure Time: " + vehicle.getDepartureTime());
        if (vehicle instanceof Train) {
            System.out.println("Price: " + ((Train) vehicle).price);
        }
    }
}
