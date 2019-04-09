public class FactoryManufacturer {
    public static AbstractVehicleFactory createVehicleFactory(Boolean smartFactory){
        if(smartFactory){
            return new SmartVehicleFactory();
        }
        return new VehicleFactory();
    }

}
