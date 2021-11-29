package gasStationVit;

import java.util.Date;

public class ServiceMain {
    //Group exercise. GAS station.
    //Sukurti programele "GAS station".
    //Parodyti vartotojui meniu, kuriame jis gali pasirinkti kokio tipo degalus pils ->>+
    //Nuskaityti vartotojo pasirinkima.
    //Atitinkamai pagal pasirinkima parinkti degalu kaina.
    //Paprasyti vartotojo ivesti koloneles numeri.
    //Ivesti kuro kieki.
    //Paskaiciuoti bendra suma.
    //Isspausdinti kasos ceki su visa su uzsipilymu susijusia informacija.
    //Naudoti geras praktikas, uzvadinimus, formatavima, net keleta skirtingu klasiu jei reikia atskirti logika.
//    Pabaigti/"isblizginti" GAS Station.
//    2.  ContactManager uzduotyje prideti papildomo funkcionalumo:
//    2.1. removeContact -> isimti kontakta is adresu knygos.
//    2.2. getContactsByGivenString -> surasti visus kontaktus, kurie atitinka eilutes gabaliuka.
//    Pvz.: ieskau pagal zodzio dali "ro" , man randa rezultatus ROkas, ROmas, ROpinskas...
//    2.3. BONUS. Padarius siuos punktus, prideti nauja konaktu sarasa naudojant ArrayList, arha HashSet.
//    ir prideti atitinkamas funkcijas.


    public static void main(String[] args) {
        double finalPrice = 0;
        Date date = new Date();

        FuelStation fuelStation = new FuelStation("UAB ARMADA", "Smiltes 2, Vilnius",
                "+3706542541254");
        FuelCalcApp fuelCalcApp = new FuelCalcApp();

        FuelTypes fuelType1 = new FuelTypes("Petrol", 1.4);
        FuelTypes fuelType2 = new FuelTypes("Diesel", 1.3);
        FuelTypes fuelType3 = new FuelTypes("Gas", 0.9);

        fuelStation.welcome();
        fuelStation.meniu();
        fuelCalcApp.stationNo();

        System.out.println("**************************************************************");
        System.out.println("           RECEIPT " + fuelStation.getStationName());
        System.out.println("Adress: " + fuelStation.getStationAdress() + ", " + "Phone number "
                + fuelStation.getPhoneNumber());
        System.out.println("**************************************************************");
        if (fuelCalcApp.serviceSelected == "VEHICLE WASH") {
            System.out.println("SERVICE SELECTED: " + fuelCalcApp.serviceSelected);
            System.out.println("SERVICE COST: " + (fuelCalcApp.washCost) + " Euro");
        }
        if (fuelCalcApp.fuelType == 1) {
            finalPrice = fuelType1.getFuelPrice() * fuelCalcApp.volumeOfFuel;
        } else if (fuelCalcApp.fuelType == 2) {
            finalPrice = fuelType2.getFuelPrice() * fuelCalcApp.volumeOfFuel;
        } else if (fuelCalcApp.fuelType == 3) {
            finalPrice = fuelType3.getFuelPrice() * fuelCalcApp.volumeOfFuel;
        }
        System.out.println("DATE:     " + date);
        System.out.println("AMOUNT:   " + finalPrice + fuelCalcApp.washCost + " Euro");
        System.out.println("INVOICE NO: XXXXXXXX");
        System.out.println("FUEL TYPE " + fuelCalcApp.fuelType);

    }
}







