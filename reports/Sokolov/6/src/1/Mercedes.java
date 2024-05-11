public class Mercedes extends Car {
    public Mercedes(String model, int productionYear, String fuelType, double engineCapacity) {
        super(model, productionYear, fuelType, engineCapacity);
    }
    @Override
    public void printInfo() {
        System.out.println("Автомобиль Mercedes модели " + super.model
                + "\nГод выпуска: " + super.productionYear
                + "\nТип топлива: " + super.fuelType
                + "\nОбъем двигателя: " + super.engineCapacity + " л");
    }
}
