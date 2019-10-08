package by.epam.task_two.entity;

import java.util.stream.Stream;

public class ShoppingVoucher extends Voucher {

    private String[] shoppingCenters;

    public void setShoppingCenters(String[] shoppingCenters) {
        this.shoppingCenters = shoppingCenters;
    }

    public String[] getShoppingCenters() {
        return shoppingCenters;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("; Shopping centers: ");
        Stream.of(shoppingCenters).forEach(x -> stringBuilder.append(x + " "));
        stringBuilder.append(".");
        return super.toString() + " " + stringBuilder.toString();
    }
}
