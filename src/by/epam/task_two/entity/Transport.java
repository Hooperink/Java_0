package by.epam.task_two.entity;

public enum Transport {

    TRAIN("Train"),
    BUS("Bus"),
    AIRPLANE("Airplane"),
    SHIP("Ship");

    public final String transport;

    Transport(String transport){
        this.transport = transport;
    }
}
