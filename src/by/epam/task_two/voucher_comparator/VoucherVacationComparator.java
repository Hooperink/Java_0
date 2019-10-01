package by.epam.task_two.voucher_comparator;

import by.epam.task_two.entity.TravelVoucher;

import java.util.Comparator;

public class VoucherVacationComparator implements Comparator<TravelVoucher> {
    @Override
    public int compare(TravelVoucher o1, TravelVoucher o2) {
        return o1.getVacationType().name().compareTo(o2.getVacationType().name());
    }
}
