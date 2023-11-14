public class Non_SubscribersPassengers extends Passenger {
    boolean discountCoupon;


    public Non_SubscribersPassengers(String name, String id, boolean b) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) {
        if (car.maxCapacity == 0) {
            throw new IllegalArgumentException("Car is not Available");
        }

        reservedCar = new Car(car.code, new Route(car.route.StartAddress, car.route.destinationAddress, car.route.price), car.maxCapacity);
        car.maxCapacity--;

        if (discountCoupon) {
            tripCost = car.route.price - (car.route.price * 0.1);
        } else {
            tripCost = car.route.price;
        }
    }

        public   void displayInfo(){
            System.out.println("\t---Non-Subscriber Passenger Info---\n");
            System.out.println("\tName: " + name);
            System.out.println("\tID: " + id);
            System.out.println("\tReserved Car Code: " + reservedCar.code);
            System.out.println("\tRoute Price: " + reservedCar.route.price);
            System.out.println("\tTrip Cost: " + tripCost+"\n");

        }

}
