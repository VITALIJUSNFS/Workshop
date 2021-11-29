package robotSample;

// brezinys atvaizduojanti pappildini -Addon

public class Addon {

    private int price;
    private String name;

    public Addon(int price, String name) {
        this.price = price;
        this.name = name;
        // Konstruktorius atmentije - isskiria vieta, sukuria objekta naudodame klase
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Addon{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
