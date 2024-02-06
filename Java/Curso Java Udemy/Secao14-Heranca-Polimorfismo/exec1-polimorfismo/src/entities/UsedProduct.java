package entities;

public class UsedProduct extends Product{
    private String manufactureDate;

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return this.manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return "Name: " + getName() + " (used) " +
                " Price: " + getPrice() +
                " Manufacture date: " + getManufactureDate();
    }
}
