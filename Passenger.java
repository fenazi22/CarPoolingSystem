public abstract class Passenger {
   String name;
   String id;
    Car reservedCar;
   double tripCost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public  abstract void reserveCar(Car car);
    public  abstract void displayInfo();

}
