package by.epam.task_two.pattern;

import by.epam.task_two.entity.CruiseVoucher;
import by.epam.task_two.entity.ExcursionVoucher;
import by.epam.task_two.entity.RestVoucher;
import by.epam.task_two.entity.ShoppingVoucher;
import by.epam.task_two.entity.TreatmentVoucher;
import by.epam.task_two.entity.VacationType;
import by.epam.task_two.entity.Voucher;
import by.epam.task_two.parser.ValueParser;
import static by.epam.task_two.regular_expressions.PatternsRegEx.COUNTRY_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.GUIDE_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.HOTEL_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.MEDICAL_INSTITUTION_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.SHIP_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.SHOPPING_CENTERS_NAME_PATTERN;

public class VoucherFactory {
    public Voucher makeVoucherWithFactory(String stringFromFile) {

        ValueParser valueParser = new ValueParser();
        VacationType vacationType = VacationType.valueOf(valueParser.getVacationType(stringFromFile).name());
        Voucher voucher = vacationType.createVoucher();

        if (voucher == null) {
            return null;
        }

        voucher.setVacationType(vacationType);
        voucher.setAmountOfDays(valueParser.getAmountOfDays(stringFromFile));
        voucher.setCountry(valueParser.parseString(stringFromFile, COUNTRY_PATTERN));
        voucher.setFoodType(valueParser.getFoodType(stringFromFile));
        voucher.setTransport(valueParser.getTransportType(stringFromFile));
        voucher.setAdditionalValue(valueParser, stringFromFile);
        return voucher;
    }


}
