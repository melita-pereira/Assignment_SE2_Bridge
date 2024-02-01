package workshop;

import vehicles.Vehicle;

public class BasicWorkshop implements Workshop{
    protected Vehicle vehicle;
    public BasicWorkshop(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void assemble() {
        System.out.println("Assembling...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Assembled.");
    }

    @Override
    public void paint() {
        System.out.println("Painting...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Painted.");    }

    @Override
    public void test() {
        System.out.println("Testing...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tested.");
    }
}
