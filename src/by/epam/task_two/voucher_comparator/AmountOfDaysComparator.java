package by.epam.task_two.voucher_comparator;

import by.epam.task_two.entity.Voucher;

import java.util.Comparator;

public class AmountOfDaysComparator implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
        return Integer.compare(o1.getAmountOfDays(), o2.getAmountOfDays());
    }
}
