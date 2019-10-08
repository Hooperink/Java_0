package by.epam.task_two;

import by.epam.task_two.entity.Voucher;
import by.epam.task_two.file_handler.VouchersFromFile;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        VouchersFromFile vouchersFromFile = new VouchersFromFile();
        List<Voucher> vouchers = vouchersFromFile.getVouchers();
        for (Voucher voucher : vouchers) {
            System.out.println(voucher);
        }

    }
}
