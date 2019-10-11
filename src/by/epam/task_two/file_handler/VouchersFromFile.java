package by.epam.task_two.file_handler;

import by.epam.task_two.entity.*;
import by.epam.task_two.pattern.VoucherFactory;
import by.epam.task_two.validator.StringValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class VouchersFromFile {

    private List<Voucher> vouchers = new ArrayList<>();

    public List<Voucher> getVouchers() {
        File file = new File("./resource/voucher.txt");
        StringValidator stringValidator = new StringValidator();
        VoucherFactory voucherFactory = new VoucherFactory();
        Voucher voucher;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                if (stringValidator.validate(temp)) {
                    voucher = voucherFactory.makeVoucherWithFactory(temp);
                    if (voucher != null) {
                        vouchers.add(voucher);
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return vouchers;
    }

}