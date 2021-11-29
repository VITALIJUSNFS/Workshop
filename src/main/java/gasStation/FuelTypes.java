package gasStation;

public class FuelTypes {

    String fueltype;
    double price;

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fuel {" +
                "Degalu tipas='" + fueltype + '\'' +
                ", Kaina=" + price +
                '}';
    }
}
