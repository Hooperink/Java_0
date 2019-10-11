package by.epam.task_two.entity;


import by.epam.task_two.parser.ValueParser;
import static by.epam.task_two.regular_expressions.PatternsRegEx.SHOPPING_CENTERS_NAME_PATTERN;

public class ShoppingVoucher extends Voucher {

    private String shoppingCenter;

    public void setShoppingCenters(String shoppingCenter) {
        this.shoppingCenter = shoppingCenter;
    }

    public void setShoppingCenter(String shoppingCenter) {
        this.shoppingCenter = shoppingCenter;
    }

    public String getShoppingCenter() {
        return shoppingCenter;
    }

    @Override
    public void setAdditionalValue(ValueParser valueParser, String stringFromFile) {
        this.setShoppingCenters(valueParser.parseString(stringFromFile, SHOPPING_CENTERS_NAME_PATTERN));
    }

    @Override
    public String toString() {
        return super.toString() + ", Shopping center: " + shoppingCenter;
    }
}
