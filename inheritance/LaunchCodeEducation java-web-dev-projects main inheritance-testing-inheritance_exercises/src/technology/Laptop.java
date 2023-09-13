package technology;

package technology;

public class Laptop extends Computer {
    private int screenSize;

    public Laptop(String brand, String model, double price, int screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }
    public void sleepMode() {
        // Implementation for laptop-specific method
    }
}
