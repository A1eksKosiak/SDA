package week7.day1;

public class InheritanceExample {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("111AAA");
        vehicle1.setNumberOfSeats(4);
        vehicle1.setSpeedLimit(10);
        System.out.println(vehicle1.toString());

        Vehicle car1 = new Car("ABC123");
        car1.setNumberOfSeats(10);             //will not set, as we Override setNumberOfSeats and returning 4
        car1.setSpeedLimit(50);
        System.out.println(car1.toString());

    }

}

class Car extends Vehicle {

    private String model;
    private String engineType;

    public Car(String licencePlate) {
        super(licencePlate);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void setNumberOfSeats(int numberOfSeats) {
        super.setNumberOfSeats(4);
    }

    @Override
    public String toString() {
        return "Car with licence plate #" + getLicencePlate() +
                ", speed limit of " + getSpeedLimit() +
                " mph, & " + getNumberOfSeats() + " seats";
    }
}

class Vehicle {

    private int speedLimit;
    private int numberOfSeats;
    private String licencePlate;

    public Vehicle(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Vehicle with licence plate #" + licencePlate +
                ", speed limit of " + speedLimit +
                " mph, & " + numberOfSeats + " seats";
    }
}

