public class VehicleFactory {

    private VehicleFactory(){

    }


    public static Vehicle createVehicle(String vehicleType){
        if(vehicleType == "car") {
            return new Car();
        } else if(vehicleType == "bike") {
            return new Bike();
        }

        return null;
    }
}
