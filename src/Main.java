//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle(); // abstract class can't be instantiated directly
        //Payment payment = new Payment();  // Interface can't be instantiated
        Car car1 = new Car("Tata");
//
//
        Vehicle car = new Car("Toyota");
        car.start();
        car.stop();
//
        Vehicle eCar = new ElectricCar("Tesla");
        eCar.start();
        eCar.stop();

        // Objects can be created only for concrete classes which doesn't have any abstract method
        Bike bike = new Bike();
        Bike bike1 = new Bike("KTM");
        Bike bike2 = new Bike("DUKE");
        Bike bike3 = new Bike("Duo", "Without Gear");

        System.out.println(bike.brand);
        System.out.println(bike1.brand);
        System.out.println(bike2.brand);

    }
}
