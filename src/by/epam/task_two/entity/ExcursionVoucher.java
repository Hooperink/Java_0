package by.epam.task_two.entity;

import by.epam.task_two.parser.ValueParser;
import static by.epam.task_two.regular_expressions.PatternsRegEx.GUIDE_NAME_PATTERN;


public class ExcursionVoucher extends Voucher {

    private String guide;

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getGuide() {
        return guide;
    }

    @Override
    public void setAdditionalValue(ValueParser valueParser, String stringFromFile) {
        this.setGuide(valueParser.parseString(stringFromFile, GUIDE_NAME_PATTERN));
    }

    @Override
    public String toString() {
        return super.toString() + "; Guide: " + guide;
    }
}
