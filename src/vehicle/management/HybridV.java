package vehicle.management;

public class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, HybridEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("HybridV Characteristics: ");
        System.out.println("Manufacture: " + getManufacture());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}
