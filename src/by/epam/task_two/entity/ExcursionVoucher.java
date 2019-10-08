package by.epam.task_two.entity;

public class ExcursionVoucher extends Voucher {

    private String guide;

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getGuide() {
        return guide;
    }

    @Override
    public String toString() {
        return super.toString() + "; Guide: " + guide;
    }
}
