abstract class Vehicle {
    String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println(brand + " is stopping.");
    }
}

class Car extends Vehicle {
    String color;

    public Car(String brand, String color) {
        super(brand);
        this.color = color;
    }

    public Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " car is starting with a key.");
    }
}

class ElectricCar extends Vehicle {
    public ElectricCar(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " electric car is starting silently.");
    }
}

class Bike {
    String brand;
    String type;

    public Bike() {

    }

    public Bike(String brand) {
        this.brand = brand;
    }


    public Bike(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
}


