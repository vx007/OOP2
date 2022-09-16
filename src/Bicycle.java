public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i=0; i< this.getWheelsCount(); i++){
            this.updateTyre();
        }
    }

}