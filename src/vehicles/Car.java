package vehicles;

public class Car implements Vehicle{

    @Override
    public void setWorkshop() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a car.");
        System.out.println("| Workshop is set" );
        System.out.println("------------------------------------\n");
    }

    @Override
    public void manufacture() {
        System.out.println("------------------------------------");
        System.out.println("| Ready to manufacture car ");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("| Manufactured car successfully.");
        System.out.println("------------------------------------\n");
    }
}
