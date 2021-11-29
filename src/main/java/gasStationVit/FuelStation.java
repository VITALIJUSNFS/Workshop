package gasStationVit;

import java.util.Scanner;

public class FuelStation {

    public static int selection;
    private String stationName;
    private String stationAdress;
    private String phoneNumber;


    public FuelStation(String stationName, String stationAdress, String phoneNumber) {
        this.stationName = stationName;
        this.stationAdress = stationAdress;
        this.phoneNumber = phoneNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationAdress() {
        return stationAdress;
    }

    public void setStationAdress(String stationAdress) {
        this.stationAdress = stationAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void welcome() {
        System.out.println("**************************************************************");
        System.out.println("           WELCOME TO STATION " + stationName);
        System.out.println("Adress: " + stationAdress + ", " + "Phone number " + phoneNumber);
        System.out.println("**************************************************************");
    }

    void meniu() {
        System.out.println("                    CHOOSE FROM MENU:");
        System.out.println("       1. CAR WASH                       2. FUEL TOP UP    ");
        System.out.println("**************************************************************");

    }

    @Override
    public String toString() {
        return "FuelStation [ " + stationName + " , " + stationAdress + ", " + phoneNumber + ']';
    }
}
