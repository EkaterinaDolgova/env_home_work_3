package skyro.company;

public class ServiceStation {
    public void check(StationInterface stationInterface ) {
        System.out.println("\nОбслуживаем " + stationInterface.getModelName());
        for (int numberOfWheel = 0; numberOfWheel < stationInterface.getWheelsCount(); numberOfWheel++) {
            stationInterface.updateTyre(numberOfWheel);
        }
        if (!(stationInterface instanceof Bycicle)) {
            stationInterface.checkEngine();
        }
        if (stationInterface instanceof Truck) {
            stationInterface.checkTrailer();
        }
    }
}

