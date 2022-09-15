public class ServiceStation implements Service {
    public void check(Transport transport) {
        printServiceMsg(transport);
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        if (transport.getClass() ==  Car.class){
            transport.checkEngine();
        }
        if (transport.getClass() == Truck.class){
            transport.checkEngine();
            transport.checkTrailer();
        }
    }

}

