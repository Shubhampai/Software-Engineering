public class Main {

    public static void main(String[] args) {
        AbstractVehicleFactory factory1 = FactoryManufacturer.createVehicleFactory(false);
        Vehicle v1 = factory1.createVehicle("bike");
        Vehicle v2 = factory1.createVehicle("car");
        v1.changeTires();
        v2.changeTires();

        AbstractVehicleFactory factory2 = FactoryManufacturer.createVehicleFactory(true);
        Vehicle v3 = factory2.createVehicle("bike");
        Vehicle v4 = factory2.createVehicle("car");
        v3.changeTires();
        v4.changeTires();
    }
}
