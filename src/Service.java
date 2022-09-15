public interface Service {

    void check(Transport transport);

    default void printServiceMsg(Transport transport){
        System.out.println("Обслуживаем " + transport.getModelName());
    }

}
