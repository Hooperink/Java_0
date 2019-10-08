package by.epam.task_two.voucher_comparator;

import by.epam.task_two.entity.Voucher;

import java.util.Comparator;

public class CountryComparator implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
        return o1.getCountry().compareToIgnoreCase(o2.getCountry());
    }
}
