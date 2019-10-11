package by.epam.task_two.entity;

import by.epam.task_two.parser.ValueParser;

import static by.epam.task_two.regular_expressions.PatternsRegEx.HOTEL_NAME_PATTERN;

public class RestVoucher extends Voucher {
    private String hotel;

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHotel() {
        return hotel;
    }

    @Override
    public void setAdditionalValue(ValueParser valueParser, String stringFromFile) {
        this.setHotel(valueParser.parseString(stringFromFile, HOTEL_NAME_PATTERN));
    }

    @Override
    public String toString() {
        return super.toString() + "; Hotel: " + hotel;
    }
}
