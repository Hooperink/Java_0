package by.epam.task_two.entity;

public class TreatmentVoucher extends Voucher {
    private String medicalInstitute;

    public void setMedicalInstitute(String medicalInstitute) {
        this.medicalInstitute = medicalInstitute;
    }

    public String getMedicalInstitute() {
        return medicalInstitute;
    }

    @Override
    public String toString() {
        return super.toString() + "; Medical institute: " + medicalInstitute;
    }
}
