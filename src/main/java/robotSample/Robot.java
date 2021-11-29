package robotSample;

import robotSample.Addon;

import java.util.Arrays;

public class Robot {

    private  int serieNo;
    private int price;
    private String name;

    private Addon addon;

    private RobotFeature[] robotFeatures;

    public Robot(int serieNo, int price, String name, Addon addon, RobotFeature[] robotFeatures) {
        this.serieNo = serieNo;
        this.price = price;
        this.name = name;
        this.addon = addon;
        this.robotFeatures = robotFeatures;
    }

    public Robot(){
    }

    public int getSerieNo() {
        return serieNo;
    }

    public void setSerieNo(int serieNo) {
        this.serieNo = serieNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Addon getAddon() {
        return addon;
    }

    public void setAddon(Addon addon) {
        this.addon = addon;
    }

    public RobotFeature[] getRobotFeatures() {
        return robotFeatures;
    }

    public void setRobotFeatures(RobotFeature[] robotFeatures) {
        this.robotFeatures = robotFeatures;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "serieNo=" + serieNo +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", addon=" + addon +
                ", robotFeatures=" + Arrays.toString(robotFeatures) +
                '}';
    }
}
