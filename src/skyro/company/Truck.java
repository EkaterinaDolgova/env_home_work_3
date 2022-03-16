package skyro.company;

public class Truck implements CarInterface {
    public String modelName;
    public int wheelsCount;

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
