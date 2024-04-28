

class Main {
    public static void main(String[] args) {
        RailwayTicketSystem system = new RailwayTicketSystem();

        // Администратор вводит данные о поездах
        system.addTrain("123", "Minsk", "12:34", 100.0);
        system.addTrain("456", "Vitebsk", "21:43", 111.0);

        // Пассажир делает заявку
        system.addPassenger("Ivan", "Minsk", "12:34");

        // Система осуществляет поиск подходящего поезда
        Train train = system.searchTrain("Minsk", "12:34");

        if (train != null) {
            // Пассажир выбирает поезд и получает счет на оплату
            Passenger passenger = system.passengers.get(0);
            system.printInvoice(passenger, train);
        } else {
            System.out.println("No suitable train found");
        }
    }
}
