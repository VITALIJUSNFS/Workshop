package gasStationVit;

import java.util.Scanner;

public class FuelCalcApp {
    Scanner scanner = new Scanner(System.in);
    int washCost = 5;
    int stationNo;
    int volumeOfFuel;
    int fuelType;
    String serviceSelected;


    public void stationNo() {
        int text = scanner.nextInt();
        if (text == 1) {
            System.out.println("                WASH SELECTED");
            System.out.println("             DRIVE TO WASH YOUR CAR");
            System.out.println("**************************************************************");
            serviceSelected = "VEHICLE WASH";
        } else if (text == 2) {
            System.out.println("                 CHOOSE FROM MENU:");
            System.out.println("<<---STATION NO 1                        STATION NO 2--->>> ");
            System.out.println("**************************************************************");
            stationNo = scanner.nextInt();
            System.out.println("**************************************************************");
            System.out.println(" PLEASE SELECT FUEL:   1.PETROL   2.DIESEL   3.GAS");
            fuelType = scanner.nextInt();
            System.out.println("**************************************************************");
            System.out.println(" PLEASE ENTER VOLUME");
            volumeOfFuel = scanner.nextInt();
        }
    }


    public String getServiceSelected() {
        return serviceSelected;
    }

    public void setServiceSelected(String serviceSelected) {
        this.serviceSelected = serviceSelected;

    }

    public int getWashCost() {
        return washCost;
    }

    public void setWashCost(int washCost) {
        this.washCost = washCost;
    }

    public int getStationNo() {
        return stationNo;
    }

    public void setStationNo(int stationNo) {
        this.stationNo = stationNo;
    }

    public int getVolumeOfFuel() {
        return volumeOfFuel;
    }

    public void setVolumeOfFuel(int volumeOfFuel) {
        this.volumeOfFuel = volumeOfFuel;
    }

    public int getFuelType() {
        return fuelType;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "FuelCalcApp{" +
                "serviceSelected='" + serviceSelected + '\'' +
                '}';
    }
}
