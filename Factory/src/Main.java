public class Main {

    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.createVehicle("car");
        Vehicle v2 = VehicleFactory.createVehicle("bike");

        v1.changeTires();
        v2.changeTires();
    }
}

