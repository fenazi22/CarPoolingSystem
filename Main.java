public class Main {
    public static void main(String[] args) {

        Route r1 = new Route("Riyadh", "Mecca", 10.0);
        Route r2 = new Route("Riyadh", "Dammam", 15);
        Car car1 = new Car("FreeCode", r1, 3);
        Car car2 = new Car("NoFree", r2, 0);
        Passenger[] passengers = new Passenger[2];
        passengers[0] = new SubscribersPassengers("Faisal", "109290666");
        passengers[1] = new Non_SubscribersPassengers("Omar", "109291111", true);
        for (Passenger passenger : passengers) {
            try {
                if (passenger instanceof SubscribersPassengers) {
                    passenger.reserveCar(car1);
                } else if (passenger instanceof Non_SubscribersPassengers) {
                    passenger.reserveCar(car2);
                }
                passenger.displayInfo();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }



    }



}