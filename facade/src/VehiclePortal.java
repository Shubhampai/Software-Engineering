public class VehiclePortal {
    private  Vehicle bike,car;

    public VehiclePortal(){
        bike = new Bike();
        car = new Car();
    }

    public void changeBikeTires(){
        bike.changeTires();
    }

    public void changeCarTires(){
        car.changeTires();
    }

    public Vehicle getBike() {
        return bike;
    }

    public void setBike(Vehicle bike) {
        this.bike = bike;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }


}
