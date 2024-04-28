import java.util.*;

class Train {
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
}

class Passenger {
    String name;
    String destination;
    String departureTime;

    public Passenger(String name, String destination, String departureTime) {
        this.name = name;
        this.destination = destination;
        this.departureTime = departureTime;
    }
}

class RailwayTicketSystem {
    List<Train> trains = new ArrayList<>();
    List<Passenger> passengers = new ArrayList<>();

    public void addTrain(String number, String destination, String departureTime, double price) {
        trains.add(new Train(number, destination, departureTime, price));
    }

    public void addPassenger(String name, String destination, String departureTime) {
        passengers.add(new Passenger(name, destination, departureTime));
    }

    public Train searchTrain(String destination, String departureTime) {
        for (Train train : trains) {
            if (train.destination.equals(destination) && train.departureTime.equals(departureTime)) {
                return train;
            }
        }
        return null;
    }

    public void printInvoice(Passenger passenger, Train train) {
        System.out.println("Invoice for " + passenger.name);
        System.out.println("Train Number: " + train.number);
        System.out.println("Destination: " + train.destination);
        System.out.println("Departure Time: " + train.departureTime);
        System.out.println("Price: " + train.price);
    }
}
