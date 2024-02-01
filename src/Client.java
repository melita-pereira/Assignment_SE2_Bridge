import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Vehicle;
import workshop.AdvancedWorkshop;
import workshop.BasicWorkshop;

public class Client {
    public static void main(String[] args) {
        testVehicle(new Car());
        testVehicle(new Bicycle());
    }

    public static void testVehicle(Vehicle vehicle) {
        System.out.println("Tests with basic workshop.");
        BasicWorkshop basicworkshop = new BasicWorkshop(vehicle);
        vehicle.setWorkshop();
        vehicle.manufacture();
        basicworkshop.assemble();
        basicworkshop.paint();
        basicworkshop.test();

        System.out.println("Tests with advanced workshop.");
        AdvancedWorkshop advancedWorkshop = new AdvancedWorkshop(vehicle);
        vehicle.manufacture();
        vehicle.setWorkshop();
        advancedWorkshop.test();
        advancedWorkshop.finalize();
    }
}