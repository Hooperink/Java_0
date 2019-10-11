package by.epam.task_two.entity;

import java.util.HashMap;
import java.util.Map;

public enum  VacationType {

    EXCURSION("Excursion"){
        @Override
        public Voucher createVoucher() {
            return new ExcursionVoucher();
        }
    },

    TREATMENT("Treatment"){
        @Override
        public Voucher createVoucher() {
            return new TreatmentVoucher();
        }
    },

    REST("Rest"){
        @Override
        public Voucher createVoucher() {
            return new RestVoucher();
        }
    },

    SHOPPING("Shopping") {
        @Override
        public Voucher createVoucher() {
            return new ShoppingVoucher();
        }
    },

    CRUISE("Cruise") {
        @Override
        public Voucher createVoucher() {
            return new CruiseVoucher();
        }
    };

    public abstract Voucher createVoucher();

    public final String type;
    private final static Map<String, VacationType> VACATIONS_TYPE_BY_NAME = new HashMap<>();

    VacationType(String type){
        this.type = type;
    }

    static {
        for (VacationType vacationType : values()){
            VACATIONS_TYPE_BY_NAME.put(vacationType.type, vacationType);
        }
    }

    public static VacationType fromString(String value){
        return VACATIONS_TYPE_BY_NAME.get(value);
    }

}
