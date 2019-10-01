package by.epam.task_two.file_handler;

import by.epam.task_two.entity.FoodType;
import by.epam.task_two.entity.TransportType;
import by.epam.task_two.entity.TravelVoucher;
import by.epam.task_two.entity.VacationType;
import by.epam.task_two.validator.StringValidator;

import javax.management.BadAttributeValueExpException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.task_two.validator.StringValidator.*;

public class VouchersFromFile {

    private List<TravelVoucher> vouchers = new ArrayList<>();

    public List<TravelVoucher> getVouchers() {
        File file = new File("./resource/voucher.txt");
        StringValidator stringValidator = new StringValidator();
        TravelVoucher voucher;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                if (stringValidator.validate(temp)) {
                    voucher = createVoucherFromString(temp);
                    if (voucher != null){
                        vouchers.add(voucher);
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return vouchers;
    }

    private TravelVoucher createVoucherFromString(String fileString){
       TravelVoucher travelVoucher = new TravelVoucher();
       travelVoucher.setAmountOfDays(getAmountOfDays(fileString));
       travelVoucher.setCountry(parseString(fileString, COUNTRY_PATTERN));
       travelVoucher.setFoodType(getFoodType(fileString));
       travelVoucher.setVacationType(getVacationType(fileString));
       travelVoucher.setTransport(getTransportType(fileString));
       return travelVoucher;
    }


    private TransportType getTransportType(String fileString) {
        String transportType = parseString(fileString, TRANSPORT_PATTERN);
        return TransportType.fromString(transportType);
    }


    private VacationType getVacationType(String fileString){
        String vacationType = parseString(fileString, VACATION_TYPE_PATTERN);
        return VacationType.fromString(vacationType);
    }


    private FoodType getFoodType(String fileString){
        String foodType = parseString(fileString, FOOD_TYPE_PATTERN);
        return FoodType.fromString(foodType);
    }

    private int getAmountOfDays(String fileString) {
        return Integer.valueOf(parseString(fileString, AMOUNT_OF_DAYS_PATTERN));
    }

    private String parseString(String fileString, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcherCountry = pattern.matcher(fileString);
        return matcherCountry.find() ? matcherCountry.group(2) : "";
    }

}