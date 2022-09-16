public class Truck extends EngineTransport implements Service {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i=0; i< this.getWheelsCount(); i++){
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }
}