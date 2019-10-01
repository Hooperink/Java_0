package by.epam.task_two.voucher_comparator;

import by.epam.task_two.entity.TravelVoucher;

import java.util.Comparator;

public class VoucherCountryComparator implements Comparator<TravelVoucher> {
    @Override
    public int compare(TravelVoucher o1, TravelVoucher o2) {
        return o1.getCountry().compareToIgnoreCase(o2.getCountry());
    }
}
