package by.epam.task_two.pattern;

import by.epam.task_two.entity.*;

public class VoucherFactory {
    public Voucher createVoucher(String voucherType) {

        if (voucherType.equalsIgnoreCase("EXCURSION")){
            return new ExcursionVoucher();
        } else if (voucherType.equalsIgnoreCase("CRUISE")){
            return new CruiseVoucher();
        } else if (voucherType.equalsIgnoreCase("SHOPPING")){
            return new ShoppingVoucher();
        } else if (voucherType.equalsIgnoreCase("REST")){
            return new RestVoucher();
        } else if (voucherType.equalsIgnoreCase("TREATMENT")){
            return new TreatmentVoucher();
        }

        return null;
    }
}
