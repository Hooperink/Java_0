package by.epam.task_two;

import by.epam.task_two.entity.TravelVoucher;
import by.epam.task_two.file_handler.VouchersFromFile;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        VouchersFromFile vouchersFromFile = new VouchersFromFile();
        List<TravelVoucher> vouchers = vouchersFromFile.getVouchers();
        for (int i = 0; i < vouchers.size(); i++){
            System.out.println(vouchers.get(i));
        }
    }
}
