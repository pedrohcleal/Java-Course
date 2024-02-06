package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public Double totalPrice(){
        return this.customsFee + getPrice();
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return "Name: " + getName() +
                " Price: " + totalPrice() +
                " CustomsFee: " + customsFee;
    }
}
