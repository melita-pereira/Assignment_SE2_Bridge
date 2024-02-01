package workshop;

import vehicles.Vehicle;

public class AdvancedWorkshop extends BasicWorkshop{
    public AdvancedWorkshop(Vehicle vehicle) {
        super(vehicle);
    }
    public void finalize() {
        System.out.println("Finalizing...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finalized.");
    }
}
