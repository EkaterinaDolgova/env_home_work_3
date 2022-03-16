package skyro.company;

public class Bycicle implements StationInterface {
    public String modelName;
    public int wheelsCount;

    public Bycicle (String modelName,int wheelsCount){
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
    }
    public String getModelName(){
        return this.modelName;
    }
    public int getWheelsCount(){
        return this.wheelsCount;
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
