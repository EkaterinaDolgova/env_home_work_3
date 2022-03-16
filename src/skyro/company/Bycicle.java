package skyro.company;

public class Bycicle implements CarInterface {
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
    public void setModelName(String modelName){
        this.modelName=modelName;
    }

    public void setWheelsCount(int wheelsCount){
        this.wheelsCount=wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
