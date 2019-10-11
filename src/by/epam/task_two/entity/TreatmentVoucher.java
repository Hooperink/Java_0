package by.epam.task_two.entity;

import by.epam.task_two.parser.ValueParser;

import static by.epam.task_two.regular_expressions.PatternsRegEx.MEDICAL_INSTITUTION_NAME_PATTERN;

public class TreatmentVoucher extends Voucher {
    private String medicalInstitute;

    public void setMedicalInstitute(String medicalInstitute) {
        this.medicalInstitute = medicalInstitute;
    }

    public String getMedicalInstitute() {
        return medicalInstitute;
    }

    @Override
    public void setAdditionalValue(ValueParser valueParser, String stringFromFile) {
        this.setMedicalInstitute(valueParser.parseString(stringFromFile, MEDICAL_INSTITUTION_NAME_PATTERN));
    }

    @Override
    public String toString() {
        return super.toString() + "; Medical institute: " + medicalInstitute;
    }
}
