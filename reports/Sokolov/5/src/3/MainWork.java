public class MainWork {
    public static void main(String[] args) {
        RailwayTicketSystem system = new RailwayTicketSystem();


        system.addTrain("123", "BREST", "12:34", 4321.0);
        system.addTrain("456", "MINSK", "12:12", 1234.0);


        system.addPassenger("Иван", "BREST", "12:34");
        system.addPassenger("Анна", "GRODNO", "12:12");


        for (Person person : system.people) {
            Vehicle vehicle = system.searchVehicle(person.getDestination(), person.getDepartureTime());
            if (vehicle != null) {
                system.printInvoice(person, vehicle);
            } else {
                System.out.println("Поезд не найден для пассажира " + person.getName());
            }
        }
    }
}

