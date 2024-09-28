

public class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ICEV Characteristics: ");
        System.out.println("Manufacture: " + getManufacture());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}
