package by.epam.task_two.file_handler;

import by.epam.task_two.entity.FoodType;
import by.epam.task_two.entity.TransportType;
import by.epam.task_two.entity.TravelVoucher;
import by.epam.task_two.entity.VacationType;
import by.epam.task_two.entity.exception.NoSuchEnumValue;
import by.epam.task_two.validator.StringValidator;

import javax.management.BadAttributeValueExpException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VouchersFromFile {

    private List<TravelVoucher> vouchers = new ArrayList<>();

    public List<TravelVoucher> getVouchers() {
        File file = new File("./resource/voucher.txt");
        StringValidator stringValidator = new StringValidator();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                if (stringValidator.validate(temp)) {
                    this.vouchers.add(createVoucherFromString(temp));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return vouchers;
    }

    private TravelVoucher createVoucherFromString(String fileString){
       TravelVoucher travelVoucher = null;
        try {
            travelVoucher = new TravelVoucher(getTransportType(fileString), getVacationType(fileString),
                    getAmountOfDays(fileString), getCountry(fileString), getFoodType(fileString));
        } catch (Exception e){
            e.printStackTrace();
        }
        return travelVoucher;
    }


    private TransportType getTransportType(String fileString) throws NoSuchEnumValue {
        Pattern patternTransport = Pattern.compile("(\\s+|\\b+)Transport:\\s*(\\w+)\\s*;");
        Matcher matcherTransportType = patternTransport.matcher(fileString);
        matcherTransportType.find();
        String transportType = matcherTransportType.group(2).trim();
        return Arrays.stream(TransportType.values()).filter(e -> e.name().equalsIgnoreCase(transportType)).findFirst().orElseThrow(() -> new NoSuchEnumValue("No such transport enum"));
    }


    private VacationType getVacationType(String fileString) throws NoSuchEnumValue {
        Pattern patternVacationType = Pattern.compile("(\\s+|\\b+)Vacation type:\\s*(\\w+)\\s*;");
        Matcher matcherVacationType = patternVacationType.matcher(fileString);
        matcherVacationType.find();
        String vacationType = matcherVacationType.group(2).trim();
        return Arrays.stream(VacationType.values()).filter(e -> e.name().equalsIgnoreCase(vacationType)).findFirst().orElseThrow(() -> new NoSuchEnumValue("No such vacation enum"));
    }


    private FoodType getFoodType(String fileString) throws NoSuchEnumValue {
        Pattern patternFoodType = Pattern.compile("(\\s+|\\b+)Food type:\\s*(\\s*\\w+\\s*\\w*)\\s*;");
        Matcher matcherFoodType = patternFoodType.matcher(fileString);
        matcherFoodType.find();
        String foodType = matcherFoodType.group(2).trim();
        return FoodType.stream().filter(e -> e.getFoodType().equalsIgnoreCase(foodType)).findFirst().orElseThrow(() -> new NoSuchEnumValue("No such food enum"));
    }

    private int getAmountOfDays (String fileString) throws BadAttributeValueExpException {
        Pattern patternAmountOfDays = Pattern.compile("(\\s+|\\b+)Amount of days:\\s*(\\d+)\\s*;");
        Matcher matcherAmountOfDays = patternAmountOfDays.matcher(fileString);
        matcherAmountOfDays.find();
        int amountOfDays = Integer.valueOf(matcherAmountOfDays.group(2));
        if (amountOfDays > 0) {
            return amountOfDays;
        } else {
            throw new BadAttributeValueExpException("Negative value " + amountOfDays);
        }
    }

    private String getCountry (String fileString){
        Pattern patternCountry = Pattern.compile("(\\s+|\\b+)Country:\\s*(\\w+)\\s*;");
        Matcher matcherCountry = patternCountry.matcher(fileString);
        matcherCountry.find();
        return matcherCountry.group(2);
    }
}