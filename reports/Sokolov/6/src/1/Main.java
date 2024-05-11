public class Main {
    public static void main(String[] args) {
        BMWCreator bmwCreator = new BMWCreator();
        Car bmw = bmwCreator.createCar();
        bmw.printInfo();
        System.out.println("");
        MercedesCreator mercedesCreator = new MercedesCreator();
        Car mercedes = mercedesCreator.createCar();
        mercedes.printInfo();
    }
}
