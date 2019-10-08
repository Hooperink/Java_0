package by.epam.task_two.entity;

public class RestVoucher extends Voucher {
    private String hotel;

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return super.toString() + "; Hotel: " + hotel;
    }
}
