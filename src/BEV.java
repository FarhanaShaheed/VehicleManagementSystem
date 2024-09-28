

public class BEV extends Vehicle {
    public BEV(Manufacture manufacture, ElectricEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("BEV Characteristics: ");
        System.out.println("Manufacture: " + getManufacture());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}

