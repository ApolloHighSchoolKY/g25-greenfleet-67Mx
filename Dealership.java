import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        Vehicle pontiac = new Vehicle("Pontiac G6");
        ElectricCar tesla = new ElectricCar("tesla ew");
        inventory.add(pontiac);
        inventory.add(tesla);
        System.out.println("--- End of Day Report ---");
        // TODO: Loop through inventory. 
        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
        for(Vehicle x: inventory)
        {
            
            if(x instanceof ElectricCar)
                if(((ElectricCar)x).getCharge()<=50.5)
                    ((ElectricCar)x).charge();
            pontiac.startEngine();
            tesla.startEngine();
            pontiac.drive(50);
            tesla.drive(50);
            System.out.println(pontiac);
            System.out.println(tesla);
        }
    }
}
