

import java.util.ArrayList;
import java.util.List;

public class VehicleManagement {

    public static void main(String[] args) {
        
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture ford = new Manufacture("Ford", "USA");

        
        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        HybridEngine hybridEngine = new HybridEngine();

        
        ICEV icev = new ICEV(toyota, combustionEngine);
        BEV bev = new BEV(tesla, electricEngine);
        HybridV hybridV = new HybridV(ford, hybridEngine);

       
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(icev);
        vehicles.add(bev);
        vehicles.add(hybridV);

        
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println();
        }
    }
}

