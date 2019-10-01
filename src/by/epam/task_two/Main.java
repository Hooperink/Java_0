package by.epam.task_two;

import by.epam.task_two.entity.TravelVoucher;
import by.epam.task_two.file_handler.VouchersFromFile;
import by.epam.task_two.voucher_comparator.VoucherCountryComparator;
import by.epam.task_two.voucher_comparator.VoucherVacationComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VouchersFromFile vouchersFromFile = new VouchersFromFile();
        List<TravelVoucher> vouchers = vouchersFromFile.getVouchers();
        for (int i = 0; i < vouchers.size(); i++){
            System.out.println(vouchers.get(i));
        }

        Comparator<TravelVoucher> travelVoucherComparator = new VoucherCountryComparator().thenComparing(new VoucherVacationComparator());
        vouchers.sort(travelVoucherComparator);
        System.out.println();
        for (TravelVoucher vou: vouchers) {
            System.out.println(vou);
        }

    }
}
