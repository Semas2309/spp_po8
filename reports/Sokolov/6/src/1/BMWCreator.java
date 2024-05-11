public class BMWCreator extends CarCreator {
    @Override
    public Car createCar() { return new BMW("X5", 2024, "Бензин", 3.0); }
}
