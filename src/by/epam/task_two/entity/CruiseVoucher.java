package by.epam.task_two.entity;

import by.epam.task_two.parser.ValueParser;
import static by.epam.task_two.regular_expressions.PatternsRegEx.SHIP_NAME_PATTERN;

public class CruiseVoucher extends Voucher{

    private String shipName;

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    @Override
    public void setAdditionalValue(ValueParser valueParser, String stringFromFile) {
        this.setShipName(valueParser.parseString(stringFromFile,SHIP_NAME_PATTERN));
    }

    @Override
    public String toString() {
        return super.toString() + "; Ship name: " + shipName;
    }
}
