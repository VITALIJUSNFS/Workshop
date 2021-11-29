package gasStation;

import java.util.Scanner;

public class GasStationMain {

    public static void main(String[] args) {

        System.out.println(" Welcome to circle K ");
        System.out.println(" Please select fuel ");

        FuelTypes fuel1 = new FuelTypes();
        fuel1.fueltype = "Petrol";
        fuel1.price = 1.5;

        FuelTypes fuel2 = new FuelTypes();
        fuel2.fueltype = "Diesel";
        fuel2.price = 1.4;

        FuelTypes fuel3 = new FuelTypes();
        fuel3.fueltype = "Gas";
        fuel3.price = 1.2;

        System.out.println("******************");
        System.out.println("Menu");
        System.out.println(" Select fuel:\n 1.Petrol \n 2.Diesel \n 3.Gas");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        if (selection == 1) {
            System.out.println("You have selected: " + fuel1);
            System.out.println(" Kiek litru pilsite? ");
            int litrai = scanner.nextInt();
            double suma = fuel1.price * litrai;
            System.out.println("Suma:" + suma);
            System.out.println("Pasirinkote degaline: ");
            int degaline = scanner.nextInt();

            System.out.println("Jus pasirinkote degaline"+degaline);
        }


    }
}
