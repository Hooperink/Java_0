package by.epam.task_two.file_handler;

import by.epam.task_two.entity.*;
import by.epam.task_two.pattern.VoucherFactory;
import by.epam.task_two.validator.StringValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.task_two.regular_expressions.PatternsRegEx.*;


public class VouchersFromFile {

    private List<Voucher> vouchers = new ArrayList<>();

    public List<Voucher> getVouchers() {
        File file = new File("./resource/voucher.txt");
        StringValidator stringValidator = new StringValidator();
        Voucher voucher;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
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

    private Voucher createVoucherFromString(String fileString){
       VoucherFactory voucherFactory = new VoucherFactory();
       Voucher voucher = voucherFactory.createVoucher(getVacationType(fileString).toString());
       if (voucher == null){
           return null;
       }
       voucher.setAmountOfDays(getAmountOfDays(fileString));
       voucher.setCountry(parseString(fileString, COUNTRY_PATTERN));
       voucher.setFoodType(getFoodType(fileString));
       voucher.setTransport(getTransportType(fileString));
       voucher.setVacationType(getVacationType(fileString));
       setFieldByType(voucher, fileString);
       return voucher;
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

    private void setFieldByType (Voucher voucher, String fileString){

        if (voucher.getVacationType().type.equalsIgnoreCase("CRUISE")){
            CruiseVoucher cruiseVoucher = (CruiseVoucher)voucher;
            cruiseVoucher.setShipName(parseString(fileString, SHIP_NAME_PATTERN));

        } else if (voucher.getVacationType().type.equalsIgnoreCase("EXCURSION")){
            ExcursionVoucher excursionVoucher = (ExcursionVoucher)voucher;
            excursionVoucher.setGuide(parseString(fileString, GUIDE_NAME_PATTERN));

        } else if (voucher.getVacationType().type.equalsIgnoreCase("TREATMENT")){
            TreatmentVoucher treatmentVoucher = (TreatmentVoucher)voucher;
            treatmentVoucher.setMedicalInstitute(parseString(fileString, MEDICAL_INSTITUTION_NAME_PATTERN));

        } else if (voucher.getVacationType().type.equalsIgnoreCase("SHOPPING")){
            ShoppingVoucher shoppingVoucher = (ShoppingVoucher)voucher;
            String[] shoppingCenters = parseString(fileString, SHOPPING_CENTERS_NAME_PATTERN).split(",");
            shoppingVoucher.setShoppingCenters(shoppingCenters);

        } else if (voucher.getVacationType().type.equalsIgnoreCase("REST")) {
            RestVoucher restVoucher = (RestVoucher)voucher;
            restVoucher.setHotel(parseString(fileString, HOTEL_NAME_PATTERN));
        }
    }

}