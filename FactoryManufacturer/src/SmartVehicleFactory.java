public class SmartVehicleFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle createVehicle(String vehicleType){
        if(vehicleType == "car"){
            return new SmartCar();
        } else if(vehicleType == "bike"){
            return new SmartBike();
        }
        return null;
    }
}
