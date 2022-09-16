public class Car extends EngineTransport implements Service{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i=0; i< this.getWheelsCount(); i++){
            this.updateTyre();
        }
        this.checkEngine();
    }
}