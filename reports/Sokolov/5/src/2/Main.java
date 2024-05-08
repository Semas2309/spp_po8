abstract class FreightTransporter {
    String name;
    int id;

    FreightTransporter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double getTransportCost(int distance);
    abstract double getTransportTime(int distance);
}

class Plane extends FreightTransporter {
    Plane(String name, int id) {
        super(name, id);
    }

    @Override
    double getTransportCost(int distance) {

        return distance * 10.0;
    }

    @Override
    double getTransportTime(int distance) {

        return distance / 700.0;
    }
}

class Train extends FreightTransporter {
    Train(String name, int id) {
        super(name, id);
    }

    @Override
    double getTransportCost(int distance) {

        return distance * 5.0; // предположим, что стоимость составляет 5 единиц за км
    }

    @Override
    double getTransportTime(int distance) {

        return distance / 100.0; //
    }
}

class Car extends FreightTransporter {
    Car(String name, int id) {
        super(name, id);
    }

    @Override
    double getTransportCost(int distance) {

        return distance * 7.0;
    }

    @Override
    double getTransportTime(int distance) {

        return distance / 60.0;
    }
}

public class Main {
    public static void main(String[] args) {

        FreightTransporter[] transporters = new FreightTransporter[] {
                new Plane("Plane1", 1),
                new Train("Train1", 2),
                new Car("Car1", 3)
        };


        int distance = 1234;


        for (FreightTransporter transporter : transporters) {
            double cost = transporter.getTransportCost(distance);
            double time = transporter.getTransportTime(distance);

            System.out.println("Transporter: " + transporter.name);
            System.out.println("Transport Cost for " + distance + " km: " + cost);
            System.out.println("Transport Time for " + distance + " km: " + time);
            System.out.println();
        }
    }
}
