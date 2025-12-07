package org.example.transportation;

public class TransportationMain {
    public static void main(String...args){
        // Upcasting
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        myCar.move();   // Output: Car is moving
        myBike.move();  // Output: Bike is moving
        myTruck.move(); // Output: Truck is moving

        //Downcasting
        if(myCar instanceof Car){
            Car specificCar = (Car) myCar;
            specificCar.move(); // Output: Car is moving
        }
        if(myBike instanceof Bike){
            Bike specificBike = (Bike) myBike;
            specificBike.move(); // This block won't execute
        }
        if(myTruck instanceof Truck){
            Truck specificTruck = (Truck) myTruck;
            specificTruck.move(); // This block won't execute
        }
    }
}
