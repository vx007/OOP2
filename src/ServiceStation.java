public class ServiceStation {
    public void check(Car car) {
        printServiceMsg(car);
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    public void check(Truck truck) {
        printServiceMsg(truck);
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        printServiceMsg(bicycle);
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    private void printServiceMsg(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
    }
}