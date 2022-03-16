package skyro.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Bycicle bycicle = new Bycicle("bycicle1",2);
        Bycicle bycicle2 = new Bycicle("bycicle2",2);
        bycicle.modelName = "bycicle1";
        bycicle2.modelName = "bycicle2";
        bycicle.wheelsCount = 2;
        bycicle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bycicle, null);
        station.check(null, bycicle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
