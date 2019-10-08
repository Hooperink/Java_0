package by.epam.task_two.entity;

public class CruiseVoucher extends Voucher{

    private String shipName;

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    @Override
    public String toString() {
        return super.toString() + "; Ship name: " + shipName;
    }
}
