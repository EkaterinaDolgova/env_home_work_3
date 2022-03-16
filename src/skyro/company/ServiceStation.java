package skyro.company;

public class ServiceStation {
    public void check(Car car, Bycicle bycicle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bycicle != null) {
            System.out.println("Обслуживаем " + bycicle.getModelName());
            for (int i = 0; i < bycicle.getWheelsCount(); i++) {
                bycicle.updateTyre();
            }
        }
    }
}
