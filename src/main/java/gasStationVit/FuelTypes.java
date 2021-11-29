package gasStationVit;

public class FuelTypes {

    private String fuelType;
    private double fuelPrice;

    public FuelTypes(String fuelType, double fuelprice) {
        this.fuelType = fuelType;
        this.fuelPrice = fuelprice;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    @Override
    public String toString() {
        return "Selected Fuel:["+"Fuel: " + fuelType + ", Price: " + fuelPrice +']';
    }
}
