package by.epam.task_two.entity;

public class TravelVoucher {

    private Transport transport;
    private VacationType vacationType;
    private int amountOfDays;
    private String country;
    private FoodType foodType;

    TravelVoucher(Transport transport,  VacationType vacationType, int amountOfDays, String country, FoodType foodType){
        this.transport = transport;
        this.vacationType = vacationType;
        this.amountOfDays = amountOfDays;
        this.country = country;
        this.foodType = foodType;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public String getCountry() {
        return country;
    }

    public Transport getTransport() {
        return transport;
    }

    public VacationType getVacationType() {
        return vacationType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVacationType(VacationType vacationType) {
        this.vacationType = vacationType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
