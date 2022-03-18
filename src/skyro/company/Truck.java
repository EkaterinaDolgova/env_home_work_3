package skyro.company;

public class Truck extends Transport {

    protected Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
