package skyro.company;

public class ServiceStation {
    public void check(Car car, Bycicle bycicle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bycicle != null) {
            System.out.println("Обслуживаем " + bycicle.modelName);
            for (int i = 0; i < bycicle.wheelsCount; i++) {
                bycicle.updateTyre();
            }
        }
    }
}
