

import java.util.ArrayList;
import java.util.List;

public class VehicleManagement {

    public static void main(String[] args) {
        
        Manufacture volkswagen = new Manufacture("Volkswagen", "Germany");
        Manufacture renault = new Manufacture("Renault", "France");
        Manufacture mazda = new Manufacture("mazda", "Japan");

        
        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        HybridEngine hybridEngine = new HybridEngine();

        
        ICEV icev = new ICEV(volkswagen, combustionEngine);
        BEV bev = new BEV(renault, electricEngine);
        HybridV hybridV = new HybridV(mazda, hybridEngine);

       
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

