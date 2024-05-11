public class BMW extends Car {
    public BMW(String model, int productionYear, String fuelType, double engineCapacity) {
        super(model, productionYear, fuelType, engineCapacity);
    }
    @Override
    public void printInfo() {
        System.out.println("Автомобиль BMW модели " + super.model
                + "\nГод выпуска: " + super.productionYear
                + "\nТип топлива: " + super.fuelType
                + "\nОбъем двигателя: " + super.engineCapacity + " л");
    }
}
