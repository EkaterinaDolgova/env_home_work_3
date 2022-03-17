package skyro.company;

<<<<<<< HEAD
public class Bycicle implements StationInterface {
=======
public class Bycicle implements CarInterface {
>>>>>>> origin/env-home_work3
    public String modelName;
    public int wheelsCount;

    public Bycicle (String modelName,int wheelsCount){
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
    }
    public String getModelName(){
        return this.modelName;
    }
<<<<<<< HEAD
    public int getWheelsCount(){
        return this.wheelsCount;
    }
=======

    public int getWheelsCount(){
        return this.wheelsCount;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;
    }

    public void setWheelsCount(int wheelsCount){
        this.wheelsCount=wheelsCount;
    }

>>>>>>> origin/env-home_work3
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
