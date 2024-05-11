public abstract class Car {
    protected String model;
    protected int productionYear;
    protected String fuelType;
    protected double engineCapacity;
    public Car(String model, int productionYear, String fuelType, double engineCapacity) {
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }
    public abstract void printInfo();
}
