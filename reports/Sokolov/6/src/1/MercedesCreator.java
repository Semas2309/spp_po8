public class MercedesCreator extends CarCreator {
    @Override
    public Car createCar() { return new Mercedes("S-Class", 2024, "Дизель", 3.5); }
}
