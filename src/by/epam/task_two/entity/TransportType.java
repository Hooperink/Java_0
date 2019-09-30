package by.epam.task_two.entity;

public enum TransportType {

    TRAIN("Train"),
    BUS("Bus"),
    AIRPLANE("Airplane"),
    SHIP("Ship");

    public final String transport;

    TransportType(String transport){
        this.transport = transport;
    }
}
