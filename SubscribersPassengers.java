public class SubscribersPassengers  extends Passenger{

    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) {
        if(car.maxCapacity==0){
            throw new IllegalArgumentException("Car is not Available");
        }
        reservedCar = new Car(car.code, new Route(car.route.StartAddress, car.route.destinationAddress, car.route.price), car.maxCapacity);
        car.maxCapacity--;
        tripCost=car.route.price*0.5;
    }

    @Override
    public void displayInfo() {

        System.out.println("\t---Subscriber Passenger Info---\n");
        System.out.println("\tName: " + name);
        System.out.println("\tID: " + id);
        System.out.println("\tReserved Car Code: " + reservedCar.code);
        System.out.println("\tRoute Price: " + reservedCar.route.price);
        System.out.println("\tTrip Cost: " + tripCost);
    }


}
