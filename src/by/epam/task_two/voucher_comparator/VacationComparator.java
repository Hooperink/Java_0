package by.epam.task_two.voucher_comparator;

import by.epam.task_two.entity.Voucher;

import java.util.Comparator;

public class VacationComparator implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
        return o1.getVacationType().name().compareTo(o2.getVacationType().name());
    }
}
