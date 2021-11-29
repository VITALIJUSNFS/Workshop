package robotSample;

public class Main {
    public static void main(String[] args) {
        Robot robotJimmy = new Robot();
        robotJimmy.setName("Jimmy");
        robotJimmy.setPrice(500);
        robotJimmy.setSerieNo(1);

        Robot robotSamsung = new Robot();
        robotSamsung.setName("Samsung");
        robotSamsung.setPrice(500);
        robotSamsung.setSerieNo(2);

        Addon goldenHelmet = new Addon(150, "golden_helmet");
        robotJimmy.setAddon(goldenHelmet);

        Addon samsung = new Addon(450, "Samsung");
        robotSamsung.setAddon(samsung);

        RobotFeature navigation = new RobotFeature("Google maps");
        RobotFeature spotify = new RobotFeature("Spotify");
        RobotFeature tinder = new RobotFeature("Tinder");
        RobotFeature[] jimmyFeatures = {navigation, spotify, tinder};
        robotJimmy.setRobotFeatures (jimmyFeatures);

        RobotFeature functions = new RobotFeature("Wifi");
        RobotFeature accessories = new RobotFeature("Bluetooth");
        RobotFeature[] samsungFeatures ={functions,accessories};
        robotSamsung.setRobotFeatures(samsungFeatures);

        System.out.println("******************");
        System.out.println(robotJimmy+" "+robotJimmy.getName());
        System.out.println(robotSamsung+" "+robotSamsung.getName());


    }
}
